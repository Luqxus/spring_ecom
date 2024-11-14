package com.example.demoWeb.service;

import com.example.demoWeb.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Macbook pro 14 M3", 18000),
            new Product(102, "Sony Xperia Mark1 5", 14000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(0, "No Item", 0));
    }

    public void addProduct(Product product){
        product.setProdId(100 + products.size() + 1);
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int idx = 0; idx < products.size(); idx++) {
            if (products.get(idx).getProdId() == product.getProdId()) {
                index = idx;
                break;
            }
        }
        products.set(index, product);
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int idx = 0; idx < products.size(); idx++) {
            if (products.get(idx).getProdId() == prodId) {
                index = idx;
                break;
            }
        }

        products.remove(index);
    }
}
