package com.bobo.keyan.hdb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.keyan.hdb.mapper.CreditMapper;
import com.bobo.keyan.hdb.model.Credit;
import com.bobo.keyan.hdb.model.CreditExample;
import com.bobo.keyan.hdb.service.api.CreditService;
@Service
public class CreditServiceImpl implements CreditService{

	@Autowired
	private CreditMapper creditMapper;
	
	
	@Override
	public int countByExample(CreditExample example) {
		// TODO Auto-generated method stub
		return creditMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CreditExample example) {
		// TODO Auto-generated method stub
		return creditMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer cId) {
		// TODO Auto-generated method stub
		return creditMapper.deleteByPrimaryKey(cId);
	}

	@Override
	public int insert(Credit record) {
		// TODO Auto-generated method stub
		return creditMapper.insert(record);
	}

	@Override
	public int insertSelective(Credit record) {
		// TODO Auto-generated method stub
		return creditMapper.insertSelective(record);
	}

	@Override
	public List<Credit> selectByExample(CreditExample example) {
		// TODO Auto-generated method stub
		return creditMapper.selectByExample(example);
	}

	@Override
	public Credit selectByPrimaryKey(Integer cId) {
		// TODO Auto-generated method stub
		return creditMapper.selectByPrimaryKey(cId);
	}

	@Override
	public int updateByExampleSelective(Credit record, CreditExample example) {
		// TODO Auto-generated method stub
		return creditMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Credit record, CreditExample example) {
		// TODO Auto-generated method stub
		return creditMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Credit record) {
		// TODO Auto-generated method stub
		return creditMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Credit record) {
		// TODO Auto-generated method stub
		return creditMapper.updateByPrimaryKey(record);
	}

}
