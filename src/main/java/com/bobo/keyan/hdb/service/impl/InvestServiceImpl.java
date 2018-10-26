package com.bobo.keyan.hdb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.keyan.hdb.mapper.InvestMapper;
import com.bobo.keyan.hdb.model.Invest;
import com.bobo.keyan.hdb.model.InvestExample;
import com.bobo.keyan.hdb.service.api.InvestService;

@Service
public class InvestServiceImpl implements InvestService{

	@Autowired
	private InvestMapper investMapper;
	
	@Override
	public int countByExample(InvestExample example) {
		// TODO Auto-generated method stub
		return investMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(InvestExample example) {
		// TODO Auto-generated method stub
		return investMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer iId) {
		// TODO Auto-generated method stub
		return investMapper.deleteByPrimaryKey(iId);
	}

	@Override
	public int insert(Invest record) {
		// TODO Auto-generated method stub
		return investMapper.insert(record);
	}

	@Override
	public int insertSelective(Invest record) {
		// TODO Auto-generated method stub
		return investMapper.insertSelective(record);
	}

	@Override
	public List<Invest> selectByExample(InvestExample example) {
		// TODO Auto-generated method stub
		return investMapper.selectByExample(example);
	}

	@Override
	public Invest selectByPrimaryKey(Integer iId) {
		// TODO Auto-generated method stub
		return investMapper.selectByPrimaryKey(iId);
	}

	@Override
	public int updateByExampleSelective(Invest record, InvestExample example) {
		// TODO Auto-generated method stub
		return investMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Invest record, InvestExample example) {
		// TODO Auto-generated method stub
		return investMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Invest record) {
		// TODO Auto-generated method stub
		return investMapper.updateByPrimaryKeySelective(record);
	}
	
	@Override
	public int updateByPrimaryKey(Invest record) {
		// TODO Auto-generated method stub
		return investMapper.updateByPrimaryKey(record);
	}

}
