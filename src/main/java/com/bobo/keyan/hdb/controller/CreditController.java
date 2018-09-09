package com.bobo.keyan.hdb.controller;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bobo.keyan.hdb.service.api.CreditService;

@Controller
@RequestMapping("/credit")
public class CreditController {
	@Autowired
	CreditService creditService;
	
	@ResponseBody
    @RequestMapping("/insertNewCredit")
	public Map<String, Object> insertNewCredit_(HttpServletResponse response, @RequestParam Map<String,Object> map) throws Exception {		
		 return creditService.insertCreditSelective(map);
	}
	
	@ResponseBody
	@RequestMapping("/selectAllCounts")
	public Map<String, Object> selectAllCounts_(HttpServletResponse response, @RequestParam Map<String,Object> map) throws Exception {
		return creditService.selectAllCount_svc(map);
	}
	@ResponseBody
	@RequestMapping("/delectAcount")
	public Map<String, Object> delectAcount_(HttpServletResponse response, @RequestParam Map<String,Object> map) throws Exception {
		return creditService.delectAcount_svc(map);
	}
}
