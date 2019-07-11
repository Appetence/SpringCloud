package com.ztx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient	//服务注册到eureka
@EnableDiscoveryClient//服务发现注解
public class DeptProvide8001_Aop {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptProvide8001_Aop.class, args);

	}

}
