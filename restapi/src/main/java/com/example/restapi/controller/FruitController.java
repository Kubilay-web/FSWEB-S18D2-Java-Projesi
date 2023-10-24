package com.example.restapi.controller;

import com.example.restapi.entity.Fruit;
import com.example.restapi.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/fruits")
public class FruitController {

    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable Long id) {
        return fruitService.getFruitById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getAllFruitsSortedByPriceDesc() {
        return fruitService.getAllFruitsSortedByPriceDesc();
    }

    @PostMapping
    public Fruit saveOrUpdateFruit(@RequestBody Fruit fruit) {
        return fruitService.saveOrUpdateFruit(fruit);
    }

    @PostMapping("/{name}")
    public List<Fruit> getFruitsByName(@PathVariable String name) {
        return fruitService.getFruitsByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteFruit(@PathVariable Long id) {
        fruitService.deleteFruit(id);
    }
}
