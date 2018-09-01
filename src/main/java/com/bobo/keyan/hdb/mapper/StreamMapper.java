package com.bobo.keyan.hdb.mapper;

import com.bobo.keyan.hdb.model.Stream;
import com.bobo.keyan.hdb.model.StreamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StreamMapper {
    int countByExample(StreamExample example);

    int deleteByExample(StreamExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Stream record);

    int insertSelective(Stream record);

    List<Stream> selectByExample(StreamExample example);

    Stream selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") Stream record, @Param("example") StreamExample example);

    int updateByExample(@Param("record") Stream record, @Param("example") StreamExample example);

    int updateByPrimaryKeySelective(Stream record);

    int updateByPrimaryKey(Stream record);
}