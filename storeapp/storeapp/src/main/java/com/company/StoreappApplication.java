package com.company;

import com.company.domain.Product;
import com.company.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StoreappApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product(null, "TV", "LG", 74343.0));
		productRepository.save(new Product(null, "Monitor", "Dell", 24343.0));
		productRepository.save(new Product(null, "Headset", "Samsung", 44343.0));
		productRepository.save(new Product(null, "Mobile", "OnePlus", 54343.0));

	}
}
