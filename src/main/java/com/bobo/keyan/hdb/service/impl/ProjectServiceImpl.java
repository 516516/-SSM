package com.bobo.keyan.hdb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.keyan.hdb.mapper.ProjectMapper;
import com.bobo.keyan.hdb.model.Project;
import com.bobo.keyan.hdb.model.ProjectExample;
import com.bobo.keyan.hdb.service.api.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectMapper projectMapper;
	
	@Override
	public int countByExample(ProjectExample example) {
		return projectMapper.countByExample(example);
	}
	
	@Override
	public int deleteByExample(ProjectExample example) {
		return projectMapper.deleteByExample(example);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pId) {
		return projectMapper.deleteByPrimaryKey(pId);
	}
	
	@Override
	public int insert(Project record) {
		return projectMapper.insert(record);
	}
	
	@Override
	public int insertSelective(Project record) {
		return projectMapper.insertSelective(record);
	}
	
	@Override
	public List<Project> selectByExample(ProjectExample example) {
		return projectMapper.selectByExample(example);
	}
	
	@Override
	public Project selectByPrimaryKey(Integer pId) {
		return projectMapper.selectByPrimaryKey(pId);
	}
	
	@Override
	public int updateByExampleSelective(Project record, ProjectExample example) {
		return projectMapper.updateByExampleSelective(record, example);
	}
	
	@Override
	public int updateByExample(Project record, ProjectExample example) {
		return projectMapper.updateByExample(record, example);
	}
	
	@Override
	public int updateByPrimaryKeySelective(Project record) {
		return projectMapper.updateByPrimaryKeySelective(record);
	}
	
	@Override
	public int updateByPrimaryKey(Project record) {
		return projectMapper.updateByPrimaryKey(record);
	}
	
}
