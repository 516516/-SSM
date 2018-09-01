package com.bobo.keyan.hdb.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

import com.bobo.keyan.hdb.model.Project;
import com.bobo.keyan.hdb.model.ProjectExample;
import com.bobo.keyan.hdb.model.ProjectExample.Criteria;
import com.bobo.keyan.hdb.service.api.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@ResponseBody
    @RequestMapping("/addproject")
	
	public Map<String, Object> addproject(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		 String projectname=request.getParameter("projectname");		 
		 BigDecimal projectamount=new BigDecimal(request.getParameter("projectamount"));		 
		 DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String projectfirstdate1=request.getParameter("projectfirstdate");
		 Date projectfirstdate=dateFormat2.parse(projectfirstdate1);		 
		 String projectenddate1=request.getParameter("projectenddate");	 
		 Date projectenddate=dateFormat2.parse(projectenddate1);		 
		 String projectdateline1=request.getParameter("projectdateline");
		 Date projectdateline=dateFormat2.parse(projectdateline1);
		 String projectrate1=request.getParameter("projectrate");
		 String projectintroduct=request.getParameter("projectintroduct");
		 Integer userId=Integer.parseInt(request.getParameter("userId"));
		 
		 Project project=new Project();
		 project.setpDateInvestfirst(projectfirstdate);
		 project.setpDateInvestend(projectenddate);
		 project.setpDateline(projectdateline);
		 project.setpName(projectname);
		 project.setpAmount(projectamount);
		 project.setpIntroduction(projectintroduct);
		 project.setpRate(projectrate1);
		 project.setpState("4");
		 project.setpCreatorId(userId);
		 
		 int flag=projectService.insertSelective(project);
		 if(1==flag) {
			 resultMap.put("result", 1);
		 }else {
			 resultMap.put("result", 0);
		 }
		 return resultMap;
	}
	
	@ResponseBody
    @RequestMapping("/getAllporjects")
	public Map<String, Object> getAllporjects(HttpServletResponse response, HttpServletRequest request) throws Exception {			
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		 ProjectExample example=new ProjectExample();
		 example.setOrderByClause("p_date_investfirst desc");
		 List<Project> projectsList=projectService.selectByExample(example);
		 resultMap.put("result", projectsList);
		 return resultMap;
	}
	
	@ResponseBody
    @RequestMapping("/getAllporjectExamine")
	public Map<String, Object> getAllporjectExamine(HttpServletResponse response, HttpServletRequest request) throws Exception {			
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		 ProjectExample example=new ProjectExample();
		 example.setOrderByClause("p_date_investfirst desc");
		 Criteria criteria=example.createCriteria();
		 criteria.andPStateEqualTo("4");
		 List<Project> projectsList=projectService.selectByExample(example);
		 resultMap.put("result", projectsList);
		 return resultMap;
	}
	
	
	@ResponseBody
    @RequestMapping("/passProject")
	public Map<String, Object> passProject(HttpServletResponse response, HttpServletRequest request) throws Exception {			
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		 
		 String content1=request.getParameter("content1");
		 String content2=request.getParameter("content2");
		 Integer projectId=Integer.parseInt(request.getParameter("projectId"));
		 Integer userId=Integer.parseInt(request.getParameter("userId"));
		 
		 Project project=new Project();
		 project.setpExamineContent(content1);
		 project.setpContent(content2);
		 project.setpState("0");
		 project.setpId(projectId);
		 project.setpAuditorId(userId);
		 
		 int result=projectService.updateByPrimaryKeySelective(project);
		 if(result!=0) {
			 resultMap.put("result", 1);
		 }else {
			 resultMap.put("result", 0);
		 }
		 return resultMap;
	}
	
	@ResponseBody
    @RequestMapping("/notPassProject")
	public Map<String, Object> notPassProject(HttpServletResponse response, HttpServletRequest request) throws Exception {			
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();
		 
		 String content1=request.getParameter("content1");
		 String content2=request.getParameter("content2");
		 Integer projectId=Integer.parseInt(request.getParameter("projectId"));
		 
		 Project project=new Project();
		 project.setpExamineContent(content1);
		 project.setpContent(content2);
		 project.setpState("5");
		 project.setpId(projectId);
		 
		 int result=projectService.updateByPrimaryKeySelective(project);
		 if(result!=0) {
			 resultMap.put("result", 1);
		 }else {
			 resultMap.put("result", 0);
		 }
		 return resultMap;
	}
}
