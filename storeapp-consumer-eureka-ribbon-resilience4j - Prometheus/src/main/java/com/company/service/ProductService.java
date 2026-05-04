package com.company.service;

import com.company.domain.Product;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service(value="product-service")
@Scope("singleton")
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    @CircuitBreaker(name="product-service", fallbackMethod = "fallBackGetProductsById")
    public Product getProductById(Long id){

        Product product = restTemplate.getForObject(
                "http://product-service/products/"+id, Product.class
        );
        return product;
    }

    public Product fallBackGetProductsById(Long id, Throwable cause){
        System.out.println("Exception caught in the fallback method" + cause.getMessage());
        return new Product(id, "Bottle", "Cello", 1111.11);
    }
}
