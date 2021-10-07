package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableEurekaClient
public class CustomerDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDbServiceApplication.class, args);
		System.err.println("Customer Client running on port number 9393");
	}

}
