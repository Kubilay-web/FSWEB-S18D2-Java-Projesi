package com.example.restapi.service;

import com.example.restapi.dao.FruitRepository;
import com.example.restapi.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit getFruitById(Long id) {
        return fruitRepository.findById(id).orElse(null);
    }

    @Override
    public List<Fruit> getFruitsByName(String name) {
        return fruitRepository.findByNameContaining(name);
    }

    @Override
    public List<Fruit> getAllFruitsSortedByPriceAsc() {
        return fruitRepository.findAllByPriceAsc();
    }

    @Override
    public List<Fruit> getAllFruitsSortedByPriceDesc() {
        return fruitRepository.findAllByPriceDesc();
    }

    @Override
    public Fruit saveOrUpdateFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public void deleteFruit(Long id) {
        fruitRepository.deleteById(id);
    }

}
