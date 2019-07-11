package com.ztx.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class ConfigerBean {
	//类似于传统的xml配置，发送rest请求时候使用
	//提供了多种远程访问http请求的方法，主要用于客户端
	@Bean
	@LoadBalanced	//客户端负载均衡注解，默认轮询算法，提供了轮询，随机， 根据相应时间加权
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
	/*		自定义时候这里必须注释掉
	//切换负载均衡算法，默认有7种，如有需要可以自定义
	@Bean
	public IRule ribbonRule() {
		System.out.println("非自定义ribbon");
		//return new ZoneAvoidanceRule();//默认规则，选择最优连接
		return new RoundRobinRule();//使用轮询算法代
		//return new RandomRule();//使用随机算法代替默认轮询算法
		//return new BestAvailableRule();//过滤掉多次访问故障处于路由器跳闸状态的服务，选择一个可用服务进行连接
		//return new RetryRule();//先按照RoundRobinRule获取服务，如果失败，会在指定时间内重试，获取可用的服务
	}
	*/
}
