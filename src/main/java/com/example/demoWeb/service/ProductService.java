package com.example.demoWeb.service;

import com.example.demoWeb.models.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = Arrays.asList(
            new Product("101", "Macbook pro 14 M3", 18000),
            new Product("102", "Sony Xperia Mark1 5", 14000)
    );

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(String prodId) {
        return products.stream().filter(p -> p.getProdId().equals(prodId)).findFirst().get();
    }
}
