package com.bobo.keyan.hdb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.keyan.hdb.mapper.ManagerMapper;
import com.bobo.keyan.hdb.model.Manager;
import com.bobo.keyan.hdb.model.ManagerExample;
import com.bobo.keyan.hdb.service.api.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService{
	 
	@Autowired
	private ManagerMapper mangerService;
	
	@Override
	public int countByExample(ManagerExample example) {
		// TODO Auto-generated method stub
		return mangerService.countByExample(example);
	}

	@Override
	public int deleteByExample(ManagerExample example) {
		// TODO Auto-generated method stub
		return mangerService.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer mId) {
		// TODO Auto-generated method stub
		return mangerService.deleteByPrimaryKey(mId);
	}

	@Override
	public int insert(Manager record) {
		// TODO Auto-generated method stub
		return mangerService.insert(record);
	}

	@Override
	public int insertSelective(Manager record) {
		// TODO Auto-generated method stub
		return mangerService.insertSelective(record);
	}

	@Override
	public List<Manager> selectByExample(ManagerExample example) {
		// TODO Auto-generated method stub
		return mangerService.selectByExample(example);
	}

	@Override
	public Manager selectByPrimaryKey(Integer mId) {
		// TODO Auto-generated method stub
		return mangerService.selectByPrimaryKey(mId);
	}

	@Override
	public int updateByExampleSelective(Manager record, ManagerExample example) {
		// TODO Auto-generated method stub
		return mangerService.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Manager record, ManagerExample example) {
		// TODO Auto-generated method stub
		return mangerService.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Manager record) {
		// TODO Auto-generated method stub
		return mangerService.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Manager record) {
		// TODO Auto-generated method stub
		return mangerService.updateByPrimaryKey(record);
	}
	
}
