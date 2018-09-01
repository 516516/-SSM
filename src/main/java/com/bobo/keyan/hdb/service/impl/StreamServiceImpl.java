package com.bobo.keyan.hdb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.keyan.hdb.mapper.StreamMapper;
import com.bobo.keyan.hdb.model.Stream;
import com.bobo.keyan.hdb.model.StreamExample;
import com.bobo.keyan.hdb.service.api.StreamService;

@Service
public class StreamServiceImpl implements StreamService{
	@Autowired
	private StreamMapper streamMapper;
	
	@Override
	public int countByExample(StreamExample example) {
		// TODO Auto-generated method stub
		return streamMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(StreamExample example) {
		// TODO Auto-generated method stub
		return streamMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer sId) {
		// TODO Auto-generated method stub
		return streamMapper.deleteByPrimaryKey(sId);
	}

	@Override
	public int insert(Stream record) {
		// TODO Auto-generated method stub
		return streamMapper.insert(record);
	}

	@Override
	public int insertSelective(Stream record) {
		// TODO Auto-generated method stub
		return streamMapper.insertSelective(record);
	}

	@Override
	public List<Stream> selectByExample(StreamExample example) {
		// TODO Auto-generated method stub
		return streamMapper.selectByExample(example);
	}

	@Override
	public Stream selectByPrimaryKey(Integer sId) {
		// TODO Auto-generated method stub
		return streamMapper.selectByPrimaryKey(sId);
	}

	@Override
	public int updateByExampleSelective(Stream record, StreamExample example) {
		// TODO Auto-generated method stub
		return streamMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Stream record, StreamExample example) {
		// TODO Auto-generated method stub
		return streamMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Stream record) {
		// TODO Auto-generated method stub
		return streamMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Stream record) {
		// TODO Auto-generated method stub
		return streamMapper.updateByPrimaryKey(record);
	}
	
}
