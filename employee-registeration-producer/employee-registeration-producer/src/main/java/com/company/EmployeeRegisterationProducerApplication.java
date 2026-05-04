package com.company;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class EmployeeRegisterationProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegisterationProducerApplication.class, args);
	}

}
