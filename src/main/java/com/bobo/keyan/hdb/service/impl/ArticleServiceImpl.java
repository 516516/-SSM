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
	public int countByExample(ArticleExample example) {
		return articleMapper.countByExample(example);
	}
	
	@Override
	public int deleteByExample(ArticleExample example) {
		return articleMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer atcId) {
		return articleMapper.deleteByPrimaryKey(atcId);
	}

	@Override
	public int insert(ArticleWithBLOBs record) {
		return articleMapper.insert(record);
	}

	@Override
	public int insertSelective(ArticleWithBLOBs record) {
		return articleMapper.insertSelective(record);
	}

	@Override
	public List<ArticleWithBLOBs> selectByExampleWithBLOBs(ArticleExample example) {
		return articleMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<Article> selectByExample(ArticleExample example) {
		return articleMapper.selectByExample(example);
	}

	@Override
	public ArticleWithBLOBs selectByPrimaryKey(Integer atcId) {
		return articleMapper.selectByPrimaryKey(atcId);
	}

	@Override
	public int updateByExampleSelective(ArticleWithBLOBs record, ArticleExample example) {
		return articleMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(ArticleWithBLOBs record, ArticleExample example) {
		return articleMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(Article record, ArticleExample example) {
		return articleMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ArticleWithBLOBs record) {
		return articleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(ArticleWithBLOBs record) {
		return articleMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(Article record) {
		return articleMapper.updateByPrimaryKey(record);
	}
	
}
