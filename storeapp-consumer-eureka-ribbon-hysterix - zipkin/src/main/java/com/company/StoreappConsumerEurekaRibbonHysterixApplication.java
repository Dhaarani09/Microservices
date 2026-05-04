package com.company;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;

@EnableCircuitBreaker
@SpringBootApplication
public class StoreappConsumerEurekaRibbonHysterixApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappConsumerEurekaRibbonHysterixApplication.class, args);
	}

	@Bean
	public Sampler alwaysSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}
