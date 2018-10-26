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

import com.bobo.keyan.hdb.model.Article;
import com.bobo.keyan.hdb.model.ArticleExample;
import com.bobo.keyan.hdb.model.ArticleExample.Criteria;
import com.bobo.keyan.hdb.model.ArticleWithBLOBs;
import com.bobo.keyan.hdb.service.api.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {
	@Autowired
	ArticleService articleService;
	@ResponseBody
    @RequestMapping("/selectAllarticle")
	public Map<String, Object> getAllArticles(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();	
		 ArticleExample example=new ArticleExample();
		 List<ArticleWithBLOBs> articlelist=articleService.selectByExampleWithBLOBs(example);
		 resultMap.put("result", articlelist);
		 return resultMap;
	}
	@ResponseBody
    @RequestMapping("/addarticle")
	public int addarticle(HttpServletResponse response, HttpServletRequest request) throws Exception {	
		String name=request.getParameter("name");
		String type=request.getParameter("type");
		String introduction=request.getParameter("introduction");
		String content=request.getParameter("content");
		int userid=Integer.parseInt(request.getParameter("userid"));
		int managerid=0;
		Date now=new Date();
		ArticleWithBLOBs article=new ArticleWithBLOBs();
		article.setAtcAuthorid(userid);
		article.setAtcContent(content);
		article.setAtcIntroduction(introduction);
		article.setAtcNum1(0);
		article.setAtcName(name);
		article.setAtcNum2(0);
		article.setAtcPublishtime(now);
		article.setAtcScrutid(managerid);
		article.setAtcState("0");
		article.setAtcType(type);
		int flag=articleService.insertSelective(article);
		return flag;
	}		
	@ResponseBody
    @RequestMapping("/deleteArticle")
	public int deletearticle(HttpServletResponse response, HttpServletRequest request) throws Exception {	
		int id=Integer.parseInt(request.getParameter("articleId"));
		return articleService.deletearticle(id);
	}
		
	@ResponseBody
    @RequestMapping("/passArticle")
	public int passArticle(HttpServletResponse response, HttpServletRequest request) throws Exception {	
		ArticleWithBLOBs article=new ArticleWithBLOBs();
		int actid=Integer.parseInt(request.getParameter("atcid"));
		int mid=Integer.parseInt(request.getParameter("mid"));
		article.setAtcId(actid);
		article.setAtcScrutid(mid);
		article.setAtcState("1");  
		return articleService.scruArticle(article);
	}
	@ResponseBody
    @RequestMapping("/nopassArticle")
	public int nopassArticle(HttpServletResponse response, HttpServletRequest request) throws Exception {	
		ArticleWithBLOBs article=new ArticleWithBLOBs();
		int atcid=Integer.parseInt(request.getParameter("atcid"));
		int mid=Integer.parseInt(request.getParameter("mid"));
		article.setAtcId(atcid);
		article.setAtcScrutid(mid);
		article.setAtcState("2");  
		return articleService.scruArticle(article);
	}
	@ResponseBody
    @RequestMapping("/praiseAtc")
	public int praiseAtc(HttpServletResponse response, HttpServletRequest request) throws Exception {	
		ArticleWithBLOBs article=new ArticleWithBLOBs();
		int atcid=Integer.parseInt(request.getParameter("atcid"));
		int num1=Integer.parseInt(request.getParameter("num1"))+1;
		article.setAtcId(atcid);
        article.setAtcNum1(num1); 
		return articleService.pcArticle(article);
	}
	@ResponseBody
    @RequestMapping("/criAtc")
	public int criAtc(HttpServletResponse response, HttpServletRequest request) throws Exception {	
		ArticleWithBLOBs article=new ArticleWithBLOBs();
		int atcid=Integer.parseInt(request.getParameter("atcid"));
		int num2=Integer.parseInt(request.getParameter("num2"))+1;
		article.setAtcId(atcid);
        article.setAtcNum2(num2); 
		return articleService.pcArticle(article);
	}
	@ResponseBody
    @RequestMapping("/selectAtcByState")
	public Map<String, Object> selectAtcByState(HttpServletResponse response, HttpServletRequest request) throws Exception {		
		 Map<String, Object> resultMap = new ConcurrentHashMap<String,Object>();	
         int value=Integer.parseInt(request.getParameter("value"));
         String name=request.getParameter("name");
         System.out.println(value);
         
		 ArticleExample example=new ArticleExample();
		 Criteria criteria=example.createCriteria();
		 if(name!=null &&  name!=""){
			 
			criteria.andAtcNameEqualTo(name);
	 }
         if(value==1){
        	 List<ArticleWithBLOBs> articlelist=articleService.selectByExampleWithBLOBs(example);
    		 resultMap.put("result", articlelist);
         }
         if(value==2){
        	 criteria.andAtcStateNotEqualTo("2");
        	 List<ArticleWithBLOBs> articlelist=articleService.selectByExampleWithBLOBs(example);
        	 resultMap.put("result", articlelist);
         }
         if(value==3){
        	 criteria.andAtcStateNotEqualTo("0");
        	 List<ArticleWithBLOBs> articlelist=articleService.selectByExampleWithBLOBs(example);
        	 resultMap.put("result", articlelist);
         }
         if(value==4){
        	 criteria.andAtcStateEqualTo("1");
        	 List<ArticleWithBLOBs> articlelist=articleService.selectByExampleWithBLOBs(example);
        	 resultMap.put("result", articlelist);
         }
         if(value==5){
        	 criteria.andAtcStateNotEqualTo("1");
        	 List<ArticleWithBLOBs> articlelist=articleService.selectByExampleWithBLOBs(example);
        	 resultMap.put("result", articlelist);
         }
         if(value==6){
        	 criteria.andAtcStateEqualTo("0");
        	 List<ArticleWithBLOBs> articlelist=articleService.selectByExampleWithBLOBs(example);
        	 resultMap.put("result", articlelist);
         }
         if(value==7){
        	 criteria.andAtcStateEqualTo("2");
        	 List<ArticleWithBLOBs> articlelist=articleService.selectByExampleWithBLOBs(example);
        	 resultMap.put("result", articlelist);
         }
         return resultMap;  
	}
	
}
