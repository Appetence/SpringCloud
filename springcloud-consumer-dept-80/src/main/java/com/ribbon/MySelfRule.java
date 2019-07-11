package com.ribbon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule() {
		System.out.print("自定义ribbon");
		return new RandomRule_Myself();
		//return new RandomRule();
	}
}
