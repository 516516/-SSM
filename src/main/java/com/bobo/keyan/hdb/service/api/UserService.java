package com.bobo.keyan.hdb.service.api;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bobo.keyan.hdb.model.User;
import com.bobo.keyan.hdb.model.UserExample;

public interface UserService {
	
    int countByExample(UserExample example);
    
    int deleteByExample(UserExample example);
    
    int deleteByPrimaryKey(Integer uId);
    
    int insert(User record);
    
    int insertSelective(User record);
    	
	List<User> selectByExample(UserExample example);
	
    User selectByPrimaryKey(Integer uId);
    
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);
    
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
    
    int updateByPrimaryKeySelective(User record);
    
    int updateByPrimaryKey(User record);
    
}

