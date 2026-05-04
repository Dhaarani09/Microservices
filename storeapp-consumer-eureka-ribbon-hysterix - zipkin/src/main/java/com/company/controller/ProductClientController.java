package com.company.controller;
import com.company.domain.Product;
import com.company.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Scope("request")
public class ProductClientController {

    @Autowired
    @Qualifier("product-service")
    private ProductService productService;

    @GetMapping("/get-products/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

}
