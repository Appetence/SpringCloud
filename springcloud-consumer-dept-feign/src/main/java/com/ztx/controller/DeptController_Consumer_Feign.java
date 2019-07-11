package com.ztx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ztx.entity.Dept;
import com.ztx.service.DeptClientService;
@RestController
public class DeptController_Consumer_Feign {

	@Autowired
	private DeptClientService service;
	
	@RequestMapping(value = "/consume/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id) {
		System.out.println("/consume/dept/get/{id}");
		return this.service.get(id);
	};
	@RequestMapping(value = "/consume/dept/list",method = RequestMethod.GET)
	public List<Dept> list(){
		System.out.println("/consume/dept/list");
		return this.service.list();
	};
	@RequestMapping(value = "/consume/dept/add",method = RequestMethod.POST)
	public boolean add(Dept dept) {
		System.out.println("/consume/dept/add");
		return this.service.add(dept);
	}; 
}
