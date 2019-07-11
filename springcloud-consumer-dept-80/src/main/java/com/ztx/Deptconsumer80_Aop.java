package com.ztx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.ribbon.MySelfRule;
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.ztx"} , excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = MySelfRule.class)}
)
@RibbonClient(name = "provider-dept", configuration = MySelfRule.class)
public class Deptconsumer80_Aop {
	

	public static void main(String[] args) {
		
		SpringApplication.run(Deptconsumer80_Aop.class, args);

	}

}
