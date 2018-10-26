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
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		String projectname = request.getParameter("projectname");
		BigDecimal projectamount = new BigDecimal(request.getParameter("projectamount"));

		String projectrate1 = request.getParameter("projectrate");
		String projectintroduct = request.getParameter("projectintroduct");
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		Integer dateline = Integer.parseInt(request.getParameter("dateline"));

		Date addtime = new Date();

		Project project = new Project();
		project.setpName(projectname);
		project.setpAmount(projectamount);
		project.setpIntroduction(projectintroduct);
		project.setpRate(projectrate1);
		project.setpState("4");
		project.setpCreatorId(userId);
		project.setpAddtime(addtime);
		project.setpDateline(dateline);
		project.setpType("1");
		project.setpInvestAmount(BigDecimal.ZERO);

		int flag = projectService.insertSelective(project);
		if (1 == flag) {
			resultMap.put("result", 1);
		} else {
			resultMap.put("result", 0);
		}
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/getAllporjects")
	public Map<String, Object> getAllporjects(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		ProjectExample example = new ProjectExample();
		Criteria criteria = example.createCriteria();
		criteria.andPStateEqualTo("0");
		String projectName = request.getParameter("projectName");
		if (projectName != null && projectName != "" && projectName.equals("") == false) {
			criteria.andPNameLike("%" + projectName + "%");
		}

		String datelinestr = request.getParameter("projectDateline");
		if (datelinestr != null && datelinestr != "" && datelinestr.equals("") == false) {
			Integer datelineInt = Integer.parseInt(datelinestr);
			criteria.andPDatelineEqualTo(datelineInt);
		}

		String projectRatestr = request.getParameter("projectRate");
		if (projectRatestr != null && projectRatestr != "" && projectRatestr.equals("") == false) {
			criteria.andPRateEqualTo(projectRatestr);
		}

		// 数据查询添加分页 胡波 2018-10-05
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int startRow = Integer.parseInt(request.getParameter("startRow"));
		int start = (startRow - 1) * pageSize;
		example.setPageSize(pageSize);
		example.setStartRow(start);
		// 数据查询添加分页结束 胡波 2018-10-05
		example.setOrderByClause("p_examine_date desc");
		List<Project> projectsList = projectService.selectByExample(example);

		ProjectExample example1 = new ProjectExample();
		Criteria criteria1 = example1.createCriteria();
		criteria1.andPStateEqualTo("0");
		if (projectName != null && projectName != "" && projectName.equals("") == false) {
			criteria1.andPNameLike("%" + projectName + "%");
		}

		if (datelinestr != null && datelinestr != "" && datelinestr.equals("") == false) {
			Integer datelineInt = Integer.parseInt(datelinestr);
			criteria1.andPDatelineEqualTo(datelineInt);
		}

		if (projectRatestr != null && projectRatestr != "" && projectRatestr.equals("") == false) {
			criteria1.andPRateEqualTo(projectRatestr);
		}
		int countNum = projectService.countByExample(example1);
		resultMap.put("result", projectsList);
		resultMap.put("total", countNum);
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/getAllporjectseExcept")
	public Map<String, Object> getAllporjectseExcepts(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		ProjectExample example = new ProjectExample();
		Criteria criteria = example.createCriteria();
//		criteria.andPStateEqualTo("0");
		String projectName = request.getParameter("projectName");
		if (projectName != null && projectName != "" && projectName.equals("") == false) {
			criteria.andPNameLike("%" + projectName + "%");
		}

		String datelinestr = request.getParameter("projectDateline");
		if (datelinestr != null && datelinestr != "" && datelinestr.equals("") == false) {
			Integer datelineInt = Integer.parseInt(datelinestr);
			criteria.andPDatelineEqualTo(datelineInt);
		}

		String projectRatestr = request.getParameter("projectRate");
		if (projectRatestr != null && projectRatestr != "" && projectRatestr.equals("") == false) {
			criteria.andPRateEqualTo(projectRatestr);
		}

		// 数据查询添加分页 胡波 2018-10-05
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int startRow = Integer.parseInt(request.getParameter("startRow"));
		int start = (startRow - 1) * pageSize;
		example.setPageSize(pageSize);
		example.setStartRow(start);
		// 数据查询添加分页结束 胡波 2018-10-05
		example.setOrderByClause("p_examine_date desc");
		List<Project> projectsList = projectService.selectByExample(example);

		ProjectExample example1 = new ProjectExample();
		Criteria criteria1 = example1.createCriteria();
//		criteria1.andPStateEqualTo("0");
		if (projectName != null && projectName != "" && projectName.equals("") == false) {
			criteria1.andPNameLike("%" + projectName + "%");
		}

		if (datelinestr != null && datelinestr != "" && datelinestr.equals("") == false) {
			Integer datelineInt = Integer.parseInt(datelinestr);
			criteria1.andPDatelineEqualTo(datelineInt);
		}

		if (projectRatestr != null && projectRatestr != "" && projectRatestr.equals("") == false) {
			criteria1.andPRateEqualTo(projectRatestr);
		}
		int countNum = projectService.countByExample(example1);
		resultMap.put("result", projectsList);
		resultMap.put("total", countNum);
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/getAllporjectExamine")
	public Map<String, Object> getAllporjectExamine(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		ProjectExample example = new ProjectExample();
		// 数据查询添加分页 胡波 2018-10-05
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int startRow = Integer.parseInt(request.getParameter("startRow"));
		int start = (startRow - 1) * pageSize;
		example.setPageSize(pageSize);
		example.setStartRow(start);
		// 数据查询添加分页结束 胡波 2018-10-05
		example.setOrderByClause("p_addtime desc");
		Criteria criteria = example.createCriteria();
		criteria.andPStateEqualTo("4");
		List<Project> projectsList = projectService.selectByExample(example);
		
		ProjectExample example1 = new ProjectExample();
		Criteria criteria1 = example1.createCriteria();
		criteria1.andPStateEqualTo("4");
		int total=projectService.countByExample(example1);
		
		resultMap.put("result", projectsList);
		resultMap.put("total", total);
		
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/passProject")
	public Map<String, Object> passProject(HttpServletResponse response, HttpServletRequest request) throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();

		String content1 = request.getParameter("content1");
		String content2 = request.getParameter("content2");
		Integer projectId = Integer.parseInt(request.getParameter("projectId"));
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		Date exam_date = new Date();

		Project project = new Project();
		project.setpExamineContent(content1);
		project.setpContent(content2);
		project.setpState("0");
		project.setpId(projectId);
		project.setpAuditorId(userId);
		project.setpExamineDate(exam_date);

		int result = projectService.updateByPrimaryKeySelective(project);
		if (result != 0) {
			resultMap.put("result", 1);
		} else {
			resultMap.put("result", 0);
		}
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/notPassProject")
	public Map<String, Object> notPassProject(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();

		String content1 = request.getParameter("content1");
		String content2 = request.getParameter("content2");
		Integer projectId = Integer.parseInt(request.getParameter("projectId"));
		Integer userId = Integer.parseInt(request.getParameter("userId"));

		Date exam_date = new Date();
		Project project = new Project();
		project.setpExamineContent(content1);
		project.setpContent(content2);
		project.setpState("5");
		project.setpId(projectId);
		project.setpAuditorId(userId);
		project.setpExamineDate(exam_date);

		int result = projectService.updateByPrimaryKeySelective(project);
		if (result != 0) {
			resultMap.put("result", 1);
		} else {
			resultMap.put("result", 0);
		}
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/getOneporject")
	public Map<String, Object> getOneporjects(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		Integer projectId = Integer.parseInt(request.getParameter("projectid"));
		Project project = projectService.selectByPrimaryKey(projectId);
		resultMap.put("result", project);
		return resultMap;
	}
}