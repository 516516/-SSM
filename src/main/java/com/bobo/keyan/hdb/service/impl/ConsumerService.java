package com.bobo.keyan.hdb.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.bobo.keyan.hdb.controller.InvestController;
import com.bobo.keyan.hdb.mapper.InvestMapper;
import com.bobo.keyan.hdb.mapper.ProjectMapper;
import com.bobo.keyan.hdb.mapper.UserMapper;
import com.bobo.keyan.hdb.model.Invest;
import com.bobo.keyan.hdb.model.InvestExample;
import com.bobo.keyan.hdb.model.InvestExample.Criteria;
import com.bobo.keyan.hdb.model.Project;
import com.bobo.keyan.hdb.model.User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 2017/1/5.
 */
@Service
public class ConsumerService {
	
	private Logger logger = LoggerFactory.getLogger(ConsumerService.class);
	
    @Resource(name="jmsTemplate")
    private JmsTemplate jmsTemplate;
    
    @Autowired
    private InvestMapper investMapper;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private UserMapper userMapper;
    
    public TextMessage receive(Destination destination){
        TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);
        try{
            System.out.println("从队列" + destination.toString() + "收到了消息：\t"
                    + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return textMessage;
    }
    
    public Map<String, Object> receive_object(Destination destination) throws JMSException{
    	
    	Map<String , Object> resultmap=new ConcurrentHashMap<String, Object>();
    	ObjectMessage objectMessage =(ObjectMessage) jmsTemplate.receive(destination);
    	
    	Invest invest=(Invest)objectMessage.getObject();
    	
    	logger.info("消费者得到消息:"+invest.toString()+"##############################");
    	logger.info("消费者用户id:"+invest.getiUserid()+"##############################");
    	
    	Integer uId=invest.getiUserid();
    	User user=userMapper.selectByPrimaryKey(uId);
    	
    	if(user.getuBalance()!=null&&user.getuBalance().compareTo(BigDecimal.ZERO)==1&&user.getuBalance().compareTo(invest.getiAmount())>=0) {
    		
    		//获取待投资项目
    		Integer projectid=invest.getiProjectid();
    		Project project=projectMapper.selectByPrimaryKey(projectid);
    		BigDecimal noInvestAmount=project.getpAmount().subtract(project.getpInvestAmount());
    		BigDecimal investAmount=invest.getiAmount();
    		
    		if(invest.getiAmount().compareTo(BigDecimal.ZERO)!=1) {
    			resultmap.put("result", 3);//失败，投资金额需要大于0
    			resultmap.put("msg", "失败，投资金额需要大于0");
    			return resultmap;
    		}
    		
    		if(noInvestAmount.compareTo(investAmount)>=0) {
    			
    			user.setuBalance(user.getuBalance().subtract(invest.getiAmount()));
    			userMapper.updateByPrimaryKey(user);
    			
    			BigDecimal projectInvestchanged=project.getpInvestAmount().add(invest.getiAmount());
    			project.setpInvestAmount(projectInvestchanged);
    			projectMapper.updateByPrimaryKey(project);  
    			
    			Date now=new Date();
    			invest.setiDatetime(now);
    			invest.setiState("1");//投资成功
    			invest.setiDatetime(now);
    			invest.setiMessage("投资成功");
    			investMapper.insertSelective(invest);
    			
    			if(noInvestAmount.compareTo(investAmount)==0) {
    				project.setpState("1");
    				projectMapper.updateByPrimaryKey(project);
    			}
    			
    		}else {
    			resultmap.put("result", 1);//项目所需的金额小于
    			resultmap.put("msg", "项目所需的金额小于所投资金额,请调整金额后投资");
    			return resultmap;
    		}
    		
    	}else {
    		resultmap.put("result", 0);
    		resultmap.put("msg", "个人余额不足,请充值后投资");
    		return resultmap;
    	}
    	
    	resultmap.put("result", 2);
    	resultmap.put("msg", "投资成功");
    	return resultmap;
    }
    
}
