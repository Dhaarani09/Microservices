package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StoreappCloudGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappCloudGatewayApiApplication.class, args);
	}

}
