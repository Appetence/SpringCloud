package com.ztx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ztx.entity.Dept;


@Mapper
public interface DeptDaoMapper {
	public boolean addDept(Dept dept);
	public Dept findById(Long id);
	public List<Dept> findAll();
}
