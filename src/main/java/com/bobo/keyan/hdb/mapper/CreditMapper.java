package com.bobo.keyan.hdb.mapper;

import com.bobo.keyan.hdb.model.Credit;
import com.bobo.keyan.hdb.model.CreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditMapper {
    int countByExample(CreditExample example);

    int deleteByExample(CreditExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Credit record);

    int insertSelective(Credit record);

    List<Credit> selectByExample(CreditExample example);

    Credit selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Credit record, @Param("example") CreditExample example);

    int updateByExample(@Param("record") Credit record, @Param("example") CreditExample example);

    int updateByPrimaryKeySelective(Credit record);

    int updateByPrimaryKey(Credit record);
}