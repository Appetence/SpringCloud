package com.ztx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient	//服务注册到eureka
@EnableDiscoveryClient//服务发现注解，事物发现
@EnableCircuitBreaker//对熔断器（Hystrix）的支持
public class DeptProvideHystrix8001_Aop {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptProvideHystrix8001_Aop.class, args);

	}

}
