package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages={"com.message"})
public class MessageCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageCenterApplication.class, args);
	}

}
