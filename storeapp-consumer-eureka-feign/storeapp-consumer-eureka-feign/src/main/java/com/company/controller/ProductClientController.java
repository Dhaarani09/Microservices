package com.company.controller;

import com.company.domain.Product;
import com.company.proxy.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("request")
public class ProductClientController {

    @Autowired
    private ProductServiceProxy productServiceProxy;

    @GetMapping("/get-products/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        Product product = productServiceProxy.getProductById(id);
        return product;
    }

    @GetMapping("/get-products")
    public List<Product> getAllProducts(){
        List<Product> products = productServiceProxy.getAllProducts();
        return products;
    }


}
