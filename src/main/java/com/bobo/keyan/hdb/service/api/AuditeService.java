package com.bobo.keyan.hdb.service.api;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bobo.keyan.hdb.model.Audite;
import com.bobo.keyan.hdb.model.AuditeExample;

public interface AuditeService {
    int countByExample(AuditeExample example);

    int deleteByExample(AuditeExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Audite record);

    int insertSelective(Audite record);

    List<Audite> selectByExample(AuditeExample example);

    Audite selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Audite record, @Param("example") AuditeExample example);

    int updateByExample(@Param("record") Audite record, @Param("example") AuditeExample example);

    int updateByPrimaryKeySelective(Audite record);

    int updateByPrimaryKey(Audite record);
}
