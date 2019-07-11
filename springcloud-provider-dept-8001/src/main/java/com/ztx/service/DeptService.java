package com.ztx.service;

import java.util.List;

import com.ztx.entity.Dept;

public interface DeptService {
	public boolean addDept(Dept dept);
	public Dept findById(Long id);
	public List<Dept> findAll();
}
