package com.ztx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ztx.entity.Dept;

@RestController
public class DeptController_Consumer {
	//public static final String REST_URL_PREFIX="http://localhost:8001/dept";
	public static final String REST_URL_PREFIX="http://provider-dept/dept";
	/**
	 * 	使用restTemplate访问restful接口
	 * 
	 * 	（url, request, responseType）
	 * 	rest请求地址，请求参数，http请求转换为对象类型
	 */
	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping(value="/consume/dept/add")
	public Boolean add( Dept dept) {
		System.out.println("/consume/dept/add");
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value="/consume/dept/get/{id}")
	public Dept findById(@PathVariable("id") Long id) {
		System.out.println("/consume/dept/get/{id}");
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id , Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consume/dept/list")
	public List<Dept> findAll(Dept dept) {
		System.out.println("/consume/dept/list");
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}
	
	//自测微服务调用是否可以获取信息，主要用于对外展现
		@RequestMapping(value = "/consume/dept/discovery" ,method=RequestMethod.GET)
		public Object discovery(){
			return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
		};
}
