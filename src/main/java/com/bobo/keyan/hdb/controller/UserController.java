package com.bobo.keyan.hdb.controller;

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
		 example.setOrderByClause("u_registime desc");
		 List<User> userList=userService.selectByExample(example);
		 resultMap.put("result", userList);
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
		 
		 String realname=request.getParameter("realname");
		 String investPassword=request.getParameter("investPassword");
		 String idcardnum=request.getParameter("idcardnum");
		 String realaddress=request.getParameter("realaddress");
		 Integer userId=Integer.parseInt(request.getParameter("userId"));
		 
		 User user=new User();
		 user.setuId(userId);
		 user.setuPaypassword(investPassword);
		 user.setuRealname(realname);
		 user.setuRealaddress(realaddress);
		 user.setuIdcard(idcardnum);
		 
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
		 return resultMap;		 
	}
	
}

