package com.company.storeapp_EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StoreappEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappEurekaServerApplication.class, args);
	}

}
