package com.ztx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ztx.dao.DeptDaoMapper;
import com.ztx.entity.Dept;
import com.ztx.service.DeptService;

@Service
public class DetpServiceImpl implements DeptService{

	@Autowired
	private DeptDaoMapper deptDaoMapper;
	
	@Override
	public boolean addDept(Dept dept) {
		// TODO Auto-generated method stub
		return deptDaoMapper.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		// TODO Auto-generated method stub
		return deptDaoMapper.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return deptDaoMapper.findAll();
	}

}
