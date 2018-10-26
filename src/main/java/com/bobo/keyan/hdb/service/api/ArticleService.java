package com.bobo.keyan.hdb.service.api;

import java.util.List;

import com.bobo.keyan.hdb.model.Article;
import com.bobo.keyan.hdb.model.ArticleExample;
import com.bobo.keyan.hdb.model.ArticleWithBLOBs;
import com.bobo.keyan.hdb.model.User;

public interface ArticleService {
	List<Article> selectByExample(ArticleExample example);
	List<ArticleWithBLOBs> selectByExampleWithBLOBs(ArticleExample example);
	int insertSelective(ArticleWithBLOBs record);
	int deletearticle(int articleId);
	int scruArticle(ArticleWithBLOBs record);
	int pcArticle(ArticleWithBLOBs record);
}
