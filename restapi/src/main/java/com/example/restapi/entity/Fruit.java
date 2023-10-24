package com.example.restapi.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
    public enum FruitType {
        SWEET,
        SOUR
    }
}
