package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StudentManagementAppAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementAppAdminApplication.class, args);
	}

}