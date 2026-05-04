package com.company.service;

import com.company.domain.Product;

import java.util.List;

public interface IProductService {

    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(Long Id);
    public void deleteProductById(Long Id);

    public List<Product> findByName(String name);
    public List<Product> findByBrand(String brand);
    public List<Product> findByPrice(double price);



}
