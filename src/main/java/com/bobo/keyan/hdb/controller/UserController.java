package com.bobo.keyan.hdb.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bobo.keyan.hdb.model.User;
import com.bobo.keyan.hdb.model.UserExample;
import com.bobo.keyan.hdb.model.UserExample.Criteria;
import com.bobo.keyan.hdb.service.api.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@ResponseBody
    @RequestMapping("/selectAllusers")
	public Map<String, Object> getAllUsers(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		 UserExample example=new UserExample();
		 Criteria criteria=example.createCriteria();
		 //数据查询添加分页 胡波 2018-10-05
		 int pageSize=Integer.parseInt(request.getParameter("pageSize"));
		 int startRow=Integer.parseInt(request.getParameter("startRow"));
		 int start=(startRow-1)*pageSize;
		 example.setPageSize(pageSize);
		 example.setStartRow(start);
		 //数据查询添加分页结束  胡波 2018-10-05
		 
		 String username=request.getParameter("username");
		 if(username!=null&&username!=""&&username.equals("")==false) {
			 criteria.andUNameLike("%"+username+"%");
		 }
		 
		 example.setOrderByClause("u_registime desc");
		 List<User> userList=userService.selectByExample(example);
		 
		 UserExample example2=new UserExample();
		 Criteria criteria2=example2.createCriteria();
		 if(username!=null&&username!=""&&username.equals("")==false) {
			 criteria2.andUNameLike("%"+username+"%");
		 }
		 int total=userService.countByExample(example2);
		 
		 resultMap.put("result", userList);
		 resultMap.put("total", total);
		 
		 return resultMap;		 
	}
	
	@ResponseBody
    @RequestMapping("/getUserByLoginName")
	public Map<String, Object> getUserByLoginName(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();	
		 String loginname=request.getParameter("loginname");
		 UserExample example=new UserExample();
		 Criteria criteria=example.createCriteria();
		 criteria.andUNameEqualTo(loginname);
		 int flag=userService.countByExample(example);
			 if(0==flag) {
				 resultMap.put("result", 0);
			 }else {
				 resultMap.put("result", 1);
				 System.out.println("测试推拉版本");
				 System.out.println("测试推拉版本");
			 }		 
		 return resultMap;		 
	}
	
	@ResponseBody
    @RequestMapping("/registers")
	public Map<String, Object> registers(HttpServletResponse response, HttpServletRequest request) throws Exception {	
		Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		
		 String loginname=request.getParameter("loginname");
		 String nickname=request.getParameter("nickname");
		 String password1=request.getParameter("password1");
		 String phonenumber=request.getParameter("phonenumber");
		 String address=request.getParameter("address");
		 String sex=request.getParameter("sex");
		 
		 User user=new User();
		 user.setuAddress(address);
		 user.setuLoginpassword(password1);
		 user.setuName(loginname);
		 user.setuSex(sex);
		 user.setuNickname(nickname);
		 user.setuPhone(phonenumber);
		 user.setuCreditworth(10);
		 user.setuState("0");
		 user.setuBalance(BigDecimal.ZERO);
		 
		 Date now=new Date();
		 user.setuRegistime(now);
		 user.setuLastlogintime(now);
		 UserExample example=new UserExample();
		 Criteria criteria=example.createCriteria();
		 criteria.andUNameEqualTo(loginname);
		 int flag=userService.countByExample(example);
		 
		 if(0==flag)
		 {
			int flag2=userService.insertSelective(user);
			System.out.print("flag2:"+flag2);
			resultMap.put("result",1);	 
		 }else {
			resultMap.put("result",0);
		 }
		 return resultMap;	
	}
	
	@ResponseBody
    @RequestMapping("/logins")
	public Map<String, Object> logins(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		 
		 String loginname=request.getParameter("loginname");
		 String password=request.getParameter("password");
		 
		 UserExample example=new UserExample();
		 Criteria criteria=example.createCriteria();
		 criteria.andUNameEqualTo(loginname);
		 
		 List<User> userList=userService.selectByExample(example);
		 if(userList.size()>0) {
			 if(userList.get(0).getuLoginpassword().equals(password)) {
				 resultMap.put("result",userList.get(0).getuId());
			 }else if(!userList.get(0).getuLoginpassword().equals(password)) {
				 resultMap.put("result", 2);
			 }	
		 }else {
			 resultMap.put("result",0);
		 }
		 return resultMap; 
	}
	
	@ResponseBody
    @RequestMapping("/realmessages")
	public Map<String, Object> setRealMessages(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		 
		 String realname=request.getParameter("u_realname");
		 String investPassword=request.getParameter("u_paypassword");
		 String idcardnum=request.getParameter("u_idcard");
		 String realaddress=request.getParameter("hukouAddress");
		 String nowaddress=request.getParameter("nowAddress");
		 Integer userId=Integer.parseInt(request.getParameter("userId"));
		 
		 User user=new User();
		 user.setuId(userId);
		 user.setuPaypassword(investPassword);
		 user.setuRealname(realname);
		 user.setuRealaddress(realaddress);
		 user.setuAddress(nowaddress);
		 user.setuIdcard(idcardnum);
		 user.setuState("1");
		 user.setuBalance(BigDecimal.ZERO);
		 user.setuInterest(BigDecimal.ZERO);
		 user.setuPrincipal(BigDecimal.ZERO);
		 int insert=userService.updateByPrimaryKeySelective(user);
		 
		 if(0==insert) {
			 resultMap.put("result", 0);
		 }else {
			 resultMap.put("result", 1);
		 }
		 return resultMap;		 
	}
	
	@ResponseBody
    @RequestMapping("/updateUser")
	public Map<String, Object> updateUser(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();	
		 Integer userId=Integer.parseInt(request.getParameter("userId"));
		 String prepassword=request.getParameter("prepassword");
		 String nowpassword=request.getParameter("nowpassword");
		 
		 User user=userService.selectByPrimaryKey(userId);
		 if(!user.getuPaypassword().equals(prepassword)) {
			 resultMap.put("result", 0);//原始密码输入出错
		 }else {
			 User user2=new User();
			 user2.setuPaypassword(nowpassword);
			 user2.setuId(userId);
			 userService.updateByPrimaryKeySelective(user2);
			 
			 resultMap.put("result", 1);
		 }
		 return resultMap;		 
	}
	@ResponseBody
	@RequestMapping("/updateUserBalance")
	public Map<String, Object> updateUserBalances(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();	
		Integer userid=Integer.parseInt(request.getParameter("userId"));
		String cardPassword=request.getParameter("cardPassword");
		String moneyamount2=request.getParameter("moneyamount");
		BigDecimal moneyamount=new BigDecimal(moneyamount2);
		
		if(!cardPassword.equals("000000")) {
			resultMap.put("result", 0);//密码出错
		}else {
			
			User user=userService.selectByPrimaryKey(userid);
			BigDecimal balance=user.getuBalance();
			User user2=new User();
			user2.setuId(userid);
			BigDecimal amount=moneyamount.add(balance);
			user2.setuBalance(amount);
			
			userService.updateByPrimaryKeySelective(user2);
			resultMap.put("result", 1);
		}
		
		return resultMap;		 
	}
	@ResponseBody
	@RequestMapping("/updateUserBalancedesc")
	public Map<String, Object> updateUserBalancedescs(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();	
		Integer userid=Integer.parseInt(request.getParameter("userId"));
		String cardPassword=request.getParameter("cardPassword");
		String moneyamount2=request.getParameter("moneyamount");
		BigDecimal moneyamount=new BigDecimal(moneyamount2);
		
		if(!cardPassword.equals("111111")) {
			resultMap.put("result", 0);//密码出错
		}else {
			
			User user=userService.selectByPrimaryKey(userid);
			BigDecimal balance=user.getuBalance();
			User user2=new User();
			user2.setuId(userid);
			BigDecimal amount=balance.subtract(moneyamount);
			user2.setuBalance(amount);
			
			userService.updateByPrimaryKeySelective(user2);
			resultMap.put("result", 1);
		}
		
		return resultMap;		 
	}
	
	@ResponseBody
	@RequestMapping("/getOneUser")
	public Map<String, Object> getOneUsers(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		Integer userid=Integer.parseInt(request.getParameter("userid"));
		User user=userService.selectByPrimaryKey(userid);
		resultMap.put("result", user);
		return resultMap;		 
	}
	
	@ResponseBody
	@RequestMapping("/delectUser")
	public Map<String, Object> delectUsers(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		Integer userid=Integer.parseInt(request.getParameter("userid"));
		userService.deleteByPrimaryKey(userid);
		resultMap.put("result", 1);
		return resultMap;		 
	}
	
}

