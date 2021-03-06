package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
public class SpringBootRestWithDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestWithDataApplication.class, args);
		System.err.println("Server running on port number 9090");
	}

}
