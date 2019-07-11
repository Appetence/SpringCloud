package com.ztx.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ztx.entity.Dept;

//@FeignClient(value = "provider-dept")
@FeignClient(value = "provider-dept",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
	@RequestMapping(value = "/dept/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id) ;
	@RequestMapping(value = "/dept/dept/list",method = RequestMethod.GET)
	public List<Dept> list();
	@RequestMapping(value = "/dept/dept/add",method = RequestMethod.POST)
	public boolean add(Dept dept); 
	
}
