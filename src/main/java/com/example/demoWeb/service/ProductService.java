package com.example.demoWeb.service;

import com.example.demoWeb.models.Product;
import com.example.demoWeb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int prodId) {
        return repository.findById(prodId).orElse(new Product(0, "No item.", 0));
    }

    public void addProduct(Product product){
        repository.save(product);
    }

    public void updateProduct(Product product) {
        repository.save(product);
    }

    public void deleteProduct(int prodId) {
        repository.deleteById(prodId);
    }
}
