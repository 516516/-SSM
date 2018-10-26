package com.bobo.keyan.hdb.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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

import com.bobo.keyan.hdb.model.Audite;
import com.bobo.keyan.hdb.model.AuditeExample;
import com.bobo.keyan.hdb.model.AuditeExample.Criteria;
import com.bobo.keyan.hdb.model.Project;
import com.bobo.keyan.hdb.service.api.AuditeService;
import com.bobo.keyan.hdb.service.api.ProjectService;

@Controller
@RequestMapping("/audite")
public class AuditeController {

	@Autowired
	AuditeService auditeService;
	@Autowired
	ProjectService projectService;

	@ResponseBody
	@RequestMapping("/addaudite")
	public Map<String, Object> addaudites(HttpServletResponse response, HttpServletRequest request) throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();

		BigDecimal moneyamount = new BigDecimal(request.getParameter("moneyamount"));
		Integer dateline = Integer.parseInt(request.getParameter("dateline"));
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		String rate = request.getParameter("rate");
		Date addtime = new Date();

		Audite audite = new Audite();
		audite.setaAmount(moneyamount);
		audite.setaDateline(dateline);
		audite.setaState("0");
		audite.setaApplytime(addtime);
		audite.setaUserid(userId);
		audite.setaInterest(rate);

		AuditeExample example = new AuditeExample();
		Criteria criteria = example.createCriteria();
		int addresult = auditeService.insertSelective(audite);
		if (0 == addresult) {
			resultMap.put("result", 0);
		} else {
			resultMap.put("result", 1);
		}
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/getAllaudite")
	public Map<String, Object> getAllaudites(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		AuditeExample example = new AuditeExample();
		Criteria criteria = example.createCriteria();
		criteria.andAStateEqualTo("0");
		// 数据查询添加分页 胡波 2018-10-05
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int startRow = Integer.parseInt(request.getParameter("startRow"));
		int start = (startRow - 1) * pageSize;
		example.setPageSize(pageSize);
		example.setStartRow(start);
		// 数据查询添加分页结束 胡波 2018-10-05
		example.setOrderByClause("a_applytime desc");
		List<Audite> auditesList = auditeService.selectByExample(example);
		
		AuditeExample example1 = new AuditeExample();
		Criteria criteria1 = example1.createCriteria();
		criteria1.andAStateEqualTo("0");
		int total=auditeService.countByExample(example1);
		resultMap.put("result", auditesList);
		resultMap.put("total", total);
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/projectPassed")
	public Map<String, Object> projectPasseds(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();

		Integer projectId = Integer.parseInt(request.getParameter("projectId"));
		String content1 = request.getParameter("content1");
		String content2 = request.getParameter("content2");
		Integer exampersonId = Integer.parseInt(request.getParameter("exampersonId"));

		Audite audite = auditeService.selectByPrimaryKey(projectId);
		Project project = new Project();

		Date date = new Date();

		project.setpAmount(audite.getaAmount());
		project.setpDateline(audite.getaDateline());
		project.setpRate(audite.getaInterest());

		project.setpBorrowerId(audite.getaId());
		project.setpAuditorId(exampersonId);
		project.setpExamineDate(date);
		project.setpCreatorId(exampersonId);
		project.setpAddtime(date);
		project.setpState("0");
		project.setpContent(content2);
		project.setpExamineContent(content1);
		project.setpType("0");
		project.setpName("个人借款");
		project.setpInvestAmount(BigDecimal.ZERO);

		int insertresult = projectService.insertSelective(project);
		if (0 == insertresult) {
			resultMap.put("result", 0);
		} else {
			Audite audite1 = new Audite();
			audite1.setaId(projectId);
			audite1.setaState("1");
			int changeAuditeState = auditeService.updateByPrimaryKeySelective(audite1);
			if (0 == changeAuditeState) {
				resultMap.put("result", 2);
			} else {
				resultMap.put("result", 1);
			}
		}
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/projectNotPassed")
	public Map<String, Object> projectNotPasseds(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		Integer projectId = Integer.parseInt(request.getParameter("projectId"));
		String content1 = request.getParameter("content1");
		String content2 = request.getParameter("content2");
		Integer exampersonId = Integer.parseInt(request.getParameter("exampersonId"));

		Audite audite = auditeService.selectByPrimaryKey(projectId);
		Project project = new Project();

		Date date = new Date();

		project.setpAmount(audite.getaAmount());
		project.setpDateline(audite.getaDateline());
		project.setpRate(audite.getaInterest());

		project.setpBorrowerId(audite.getaId());
		project.setpAuditorId(exampersonId);
		project.setpExamineDate(date);
		project.setpCreatorId(exampersonId);
		project.setpAddtime(date);
		project.setpState("5");
		project.setpContent(content2);
		project.setpExamineContent(content1);
		project.setpType("0");
		project.setpName("个人借款");

		int insertresult = projectService.insertSelective(project);
		if (0 == insertresult) {
			resultMap.put("result", 0);
		} else {
			Audite audite1 = new Audite();
			audite1.setaId(projectId);
			audite1.setaState("4");
			int changeAuditeState = auditeService.updateByPrimaryKeySelective(audite1);
			if (0 == changeAuditeState) {
				resultMap.put("result", 2);
			} else {
				resultMap.put("result", 1);
			}
		}
		return resultMap;
	}

	@ResponseBody
	@RequestMapping("/getMyselfAudite")
	public Map<String, Object> getMyselfAudites(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		AuditeExample auditeExample = new AuditeExample();
		Criteria criteria = auditeExample.createCriteria();
		criteria.andAUseridEqualTo(userId);
		// 数据查询添加分页 胡波 2018-10-05
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int startRow = Integer.parseInt(request.getParameter("startRow"));
		int start = (startRow - 1) * pageSize;
		auditeExample.setPageSize(pageSize);
		auditeExample.setStartRow(start);
		auditeExample.setOrderByClause("a_applytime desc");
		// 数据查询添加分页结束 胡波 2018-10-05
		String datelinestr = request.getParameter("projectDateline");
		if (datelinestr != null && datelinestr != "" && datelinestr.equals("") == false) {
			Integer datelineInt = Integer.parseInt(datelinestr);
			criteria.andADatelineEqualTo(datelineInt);
		}

		String projectRatestr = request.getParameter("projectRate");
		if (projectRatestr != null && projectRatestr != "" && projectRatestr.equals("") == false) {
			criteria.andAInterestEqualTo(projectRatestr);
		}

		List<Audite> auditelist = auditeService.selectByExample(auditeExample);

		AuditeExample auditeExample1 = new AuditeExample();
		Criteria criteria1 = auditeExample1.createCriteria();
		criteria1.andAUseridEqualTo(userId);
		if (datelinestr != null && datelinestr != "" && datelinestr.equals("") == false) {
			Integer datelineInt = Integer.parseInt(datelinestr);
			criteria1.andADatelineEqualTo(datelineInt);
		}

		if (projectRatestr != null && projectRatestr != "" && projectRatestr.equals("") == false) {
			criteria1.andAInterestEqualTo(projectRatestr);
		}
		int total = auditeService.countByExample(auditeExample1);
		
		BigDecimal auditeAmount = BigDecimal.ZERO;
		BigDecimal interestAmount = BigDecimal.ZERO;
		
		criteria1.andAStateEqualTo("2");
		List<Audite> auditelistNum = auditeService.selectByExample(auditeExample1);
		for (int i = 0; i < auditelistNum.size(); i++) {
			Audite audite = auditelistNum.get(i);
			double dateline = audite.getaDateline() * 3 / 3650.0;
			double interest = Double.parseDouble(audite.getaInterest());
			double interestNum = dateline * interest*audite.getaAmount().doubleValue();
			interestAmount = interestAmount.add(new BigDecimal(interestNum));
			auditeAmount = auditeAmount.add(audite.getaAmount());
		}
		DecimalFormat df = new DecimalFormat("#.00");
		double interestAmount1 = Double.parseDouble(df.format(interestAmount.doubleValue()));
		
		resultMap.put("result", auditelist);
		resultMap.put("total", total);
		resultMap.put("auditeAmount", auditeAmount);
		resultMap.put("interestAmount1", interestAmount1);

		return resultMap;
	}

}
