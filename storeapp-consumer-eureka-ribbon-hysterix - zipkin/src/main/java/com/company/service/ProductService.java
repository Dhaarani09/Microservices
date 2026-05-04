package com.company.service;

import com.company.domain.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service(value="product-service")
@Scope("singleton")
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBackGetProductsById")
    public Product getProductById(Long id){

        Product product = restTemplate.getForObject(
                "http://product-service/products/"+id, Product.class
        );
        return product;
    }

    public Product fallBackGetProductsById(Long id){
        return new Product(id, "Bottle", "Cello", 1111.11);
    }
}
