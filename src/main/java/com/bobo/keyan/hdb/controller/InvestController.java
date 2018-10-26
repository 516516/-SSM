package com.bobo.keyan.hdb.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bobo.keyan.hdb.model.Invest;
import com.bobo.keyan.hdb.model.InvestExample;
import com.bobo.keyan.hdb.model.Project;
import com.bobo.keyan.hdb.model.InvestExample.Criteria;
import com.bobo.keyan.hdb.service.api.InvestService;
import com.bobo.keyan.hdb.service.api.ProjectService;
import com.bobo.keyan.hdb.service.impl.ConsumerService;
import com.bobo.keyan.hdb.service.impl.ProducerService;
import com.bobo.keyan.hdb.util.Arith;

@Controller
@RequestMapping("/invest")
public class InvestController {
	private Logger logger = LoggerFactory.getLogger(InvestController.class);

	@Autowired
	ConsumerService consumerService;

	@Autowired
	ProducerService producerService;

	@Autowired
	InvestService investService;
	
	@Autowired
	ProjectService projectService;

	@Resource(name = "demoQueueDestination")
	Destination destination;

	@ResponseBody
	@RequestMapping("/procuctAcount")
	public Map<String, Object> procuctAcount_(HttpServletResponse response, @RequestParam Map<String, Object> map)
			throws Exception {

		Invest invest = new Invest();
		invest.setiUserid(Integer.parseInt((String) map.get("userid")));
		invest.setiProjectid(Integer.parseInt((String) map.get("projectid")));
		BigDecimal bDecimal = new BigDecimal((String) map.get("amount"));
		bDecimal.setScale(4, BigDecimal.ROUND_HALF_UP);
		invest.setiAmount(bDecimal);
		invest.setiInterest((String) map.get("interst"));
		invest.setiState("0");// 支付中

		logger.info("userid:" + invest.getiUserid() + "____________________________");

		producerService.sendObjectMessage(destination, invest);
		return consumerService.receive_object(destination);

	}

	@ResponseBody
	@RequestMapping("/getAllinvest")
	public Map<String, Object> getAllinvest(HttpServletResponse response, HttpServletRequest request) throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		Integer projectid = Integer.parseInt(request.getParameter("projectid"));
		// 数据查询添加分页 胡波 2018-10-05
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int startRow = Integer.parseInt(request.getParameter("startRow"));
		int start = (startRow - 1) * pageSize;
		
		InvestExample example = new InvestExample();
		Criteria criteria = example.createCriteria();
		criteria.andIProjectidEqualTo(projectid);
		example.setPageSize(pageSize);
		example.setStartRow(start);
		example.setOrderByClause("i_datetime desc");
		List<Invest> investList = investService.selectByExample(example);
		
		InvestExample example1=new InvestExample();
		Criteria criteria1 = example1.createCriteria();
		criteria1.andIProjectidEqualTo(projectid);
		int total=investService.countByExample(example1);
		
		resultMap.put("result", investList);
		resultMap.put("total", total);
		return resultMap;
	}
	@ResponseBody
	@RequestMapping("/getAllinvestByUserId")
	public Map<String, Object> getAllinvestByUserIds(HttpServletResponse response, HttpServletRequest request) throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		Integer userid = Integer.parseInt(request.getParameter("userid"));
		// 数据查询添加分页 胡波 2018-10-05
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int startRow = Integer.parseInt(request.getParameter("startRow"));
		int start = (startRow - 1) * pageSize;
		
		InvestExample example = new InvestExample();
		Criteria criteria = example.createCriteria();
		criteria.andIUseridEqualTo(userid);
		example.setPageSize(pageSize);
		example.setStartRow(start);
		example.setOrderByClause("i_datetime desc");
		List<Invest> investList = investService.selectByExample(example);
		
		InvestExample example1=new InvestExample();
		Criteria criteria1 = example1.createCriteria();
		criteria1.andIUseridEqualTo(userid);
		int total=investService.countByExample(example1);
		List<Invest> investListNum=investService.selectByExample(example1);
		
		BigDecimal investNum=BigDecimal.ZERO;
		double interstNum=0.0;
		for(int i=0;i<investListNum.size();i++) {
			Invest invest=investListNum.get(i);
			investNum=investNum.add(invest.getiAmount());
			Project project=projectService.selectByPrimaryKey(invest.getiProjectid());
			double dateline=project.getpDateline()*3*invest.getiAmount().doubleValue()/3650.0;
			double interestdouble=Double.parseDouble(invest.getiInterest());
			double interest=Arith.mul(dateline, interestdouble);
			interstNum=Arith.add(interstNum, interest);
		}
		
		DecimalFormat df = new DecimalFormat("#.00");  
		interstNum=Double.parseDouble(df.format(interstNum));
		resultMap.put("result", investList);
		resultMap.put("total", total);
		resultMap.put("investNum", investNum);
		resultMap.put("interstNum", interstNum);
		return resultMap;
	}
}
