package com.ztx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer//标识Eureka
public class DeptComsumerEureka7001 {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptComsumerEureka7001.class, args);

	}

}
