package com.bobo.keyan.hdb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.keyan.hdb.mapper.AuditeMapper;
import com.bobo.keyan.hdb.model.Audite;
import com.bobo.keyan.hdb.model.AuditeExample;
import com.bobo.keyan.hdb.service.api.AuditeService;

@Service 
public class AuditeServiceImpl implements AuditeService{
	
	@Autowired
	AuditeMapper auditeMapper;
	
	@Override
	public int countByExample(AuditeExample example) {
		return auditeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AuditeExample example) {
		// TODO Auto-generated method stub
		return auditeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer aId) {
		// TODO Auto-generated method stub
		return auditeMapper.deleteByPrimaryKey(aId);
	}

	@Override
	public int insert(Audite record) {
		// TODO Auto-generated method stub
		return auditeMapper.insert(record);
	}

	@Override
	public int insertSelective(Audite record) {
		// TODO Auto-generated method stub
		return auditeMapper.insertSelective(record);
	}

	@Override
	public List<Audite> selectByExample(AuditeExample example) {
		// TODO Auto-generated method stub
		return auditeMapper.selectByExample(example);
	}

	@Override
	public Audite selectByPrimaryKey(Integer aId) {
		// TODO Auto-generated method stub
		return auditeMapper.selectByPrimaryKey(aId);
	}

	@Override
	public int updateByExampleSelective(Audite record, AuditeExample example) {
		// TODO Auto-generated method stub
		return auditeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Audite record, AuditeExample example) {
		// TODO Auto-generated method stub
		return auditeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Audite record) {
		// TODO Auto-generated method stub
		return auditeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Audite record) {
		// TODO Auto-generated method stub
		return auditeMapper.updateByPrimaryKey(record);
	}
	
}
