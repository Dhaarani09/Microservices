package com.company.service;

import com.company.domain.Product;
import com.company.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "productService")
@Scope(value = "singleton")
public class ProductService implements IProductService{

    @Autowired
    @Qualifier(value = "productRepository")
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long Id) {
        return productRepository.findById(Id).get();
    }

    @Override
    public void deleteProductById(Long Id) {
        productRepository.deleteById(Id);

    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> findByPrice(double price) {
        return productRepository.findByPrice(price);
    }
}
