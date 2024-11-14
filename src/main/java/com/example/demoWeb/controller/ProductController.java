package com.example.demoWeb.controller;


import com.example.demoWeb.models.Product;
import com.example.demoWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("products/{id}")
    public Product getProductById(String prodId) {
        return productService.getProduct(prodId);
    }
}
