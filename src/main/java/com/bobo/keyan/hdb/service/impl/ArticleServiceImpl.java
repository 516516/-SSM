package com.bobo.keyan.hdb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.keyan.hdb.mapper.ArticleMapper;
import com.bobo.keyan.hdb.model.Article;
import com.bobo.keyan.hdb.model.ArticleExample;
import com.bobo.keyan.hdb.model.ArticleWithBLOBs;
import com.bobo.keyan.hdb.service.api.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;
	@Override
	public List<Article> selectByExample(ArticleExample example) {
		// TODO Auto-generated method stub
		return articleMapper.selectByExample(example);
	}
	@Override
	public List<ArticleWithBLOBs> selectByExampleWithBLOBs(ArticleExample example) {
		// TODO Auto-generated method stub
		return articleMapper.selectByExampleWithBLOBs(example);
	}
	@Override
	public int insertSelective(ArticleWithBLOBs record) {
		// TODO Auto-generated method stub
		return articleMapper.insertSelective(record);
	}
	@Override
	public int deletearticle(int articleId) {
		// TODO Auto-generated method stub
		return articleMapper.deleteByPrimaryKey(articleId);
	}
	@Override
	public int scruArticle(ArticleWithBLOBs record) {
		// TODO Auto-generated method stub
		
		return articleMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int pcArticle(ArticleWithBLOBs record) {
		// TODO Auto-generated method stub
		return articleMapper.updateByPrimaryKeySelective(record);
	}

}
