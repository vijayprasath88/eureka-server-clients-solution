package com.codework.eurekaeurope4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaEurope4Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaEurope4Application.class, args);
	}
}
