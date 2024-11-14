package com.example.demoWeb.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  prodId;
    private String productName;
    private int price;
}
