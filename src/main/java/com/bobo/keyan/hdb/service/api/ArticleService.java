package com.bobo.keyan.hdb.service.api;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bobo.keyan.hdb.model.Article;
import com.bobo.keyan.hdb.model.ArticleExample;
import com.bobo.keyan.hdb.model.ArticleWithBLOBs;

public interface ArticleService {
    int countByExample(ArticleExample example);
    
    int deleteByExample(ArticleExample example);
    	
    int deleteByPrimaryKey(Integer atcId);
    
    int insert(ArticleWithBLOBs record);
    
    int insertSelective(ArticleWithBLOBs record);
    
    List<ArticleWithBLOBs> selectByExampleWithBLOBs(ArticleExample example);
    
    List<Article> selectByExample(ArticleExample example);
    
    ArticleWithBLOBs selectByPrimaryKey(Integer atcId);
    
    int updateByExampleSelective(@Param("record") ArticleWithBLOBs record, @Param("example") ArticleExample example);
    
    int updateByExampleWithBLOBs(@Param("record") ArticleWithBLOBs record, @Param("example") ArticleExample example);
    
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(ArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleWithBLOBs record);

    int updateByPrimaryKey(Article record);
}
