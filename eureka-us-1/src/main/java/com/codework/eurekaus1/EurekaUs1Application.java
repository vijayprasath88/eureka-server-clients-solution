package com.codework.eurekaus1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaUs1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaUs1Application.class, args);
	}
}
