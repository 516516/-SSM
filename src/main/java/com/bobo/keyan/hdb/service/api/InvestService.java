package com.bobo.keyan.hdb.service.api;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bobo.keyan.hdb.model.Invest;
import com.bobo.keyan.hdb.model.InvestExample;

public interface InvestService {
    int countByExample(InvestExample example);

    int deleteByExample(InvestExample example);

    int deleteByPrimaryKey(Integer iId);

    int insert(Invest record);

    int insertSelective(Invest record);

    List<Invest> selectByExample(InvestExample example);

    Invest selectByPrimaryKey(Integer iId);

    int updateByExampleSelective(@Param("record") Invest record, @Param("example") InvestExample example);

    int updateByExample(@Param("record") Invest record, @Param("example") InvestExample example);

    int updateByPrimaryKeySelective(Invest record);

    int updateByPrimaryKey(Invest record);
}
