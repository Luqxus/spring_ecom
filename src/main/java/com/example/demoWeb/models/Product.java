package com.example.demoWeb.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@Component
public class Product {

    @Id
    private int prodId;
    private String productName;
    private int price;
}
