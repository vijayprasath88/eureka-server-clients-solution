package com.codework.eurekaindia3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaIndia3Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaIndia3Application.class, args);
	}
}
