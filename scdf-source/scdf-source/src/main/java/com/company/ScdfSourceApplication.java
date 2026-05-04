package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.function.Supplier;

@SpringBootApplication
public class ScdfSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScdfSourceApplication.class, args);
	}

	// Emits timestamp every time the binder polls
	@Bean
	public Supplier<Long> timeSupplier() {
		return () -> new Date().getTime();
	}
}