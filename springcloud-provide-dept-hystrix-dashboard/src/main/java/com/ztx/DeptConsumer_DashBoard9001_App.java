package com.ztx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@SpringBootApplication
@EnableHystrixDashboard//消费端监控注解
public class DeptConsumer_DashBoard9001_App {
	//集中监控消费端，

	public static void main(String[] args) {

		SpringApplication.run(DeptConsumer_DashBoard9001_App.class, args);

	}

}
