package com.example.restapi.service;

import com.example.restapi.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> getAllFruits();
    Fruit getFruitById(Long id);
    List<Fruit> getFruitsByName(String name);
    List<Fruit> getAllFruitsSortedByPriceAsc();
    List<Fruit> getAllFruitsSortedByPriceDesc();
    Fruit saveOrUpdateFruit(Fruit fruit);
    void deleteFruit(Long id);

}
