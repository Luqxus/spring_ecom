package com.example.demoWeb.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Product {
    private String prodId;
    private String productName;
    private int price;
}
