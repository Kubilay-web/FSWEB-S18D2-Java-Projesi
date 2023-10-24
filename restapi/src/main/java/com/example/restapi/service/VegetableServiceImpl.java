package com.example.restapi.service;

import com.example.restapi.dao.VegetableRepository;
import com.example.restapi.entity.Fruit;
import com.example.restapi.entity.Vegetable;

import java.util.List;

public class VegetableServiceImpl implements VegetableService {
    private final VegetableRepository vegetableRepository;

    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }


    @Override
    public List<Vegetable> getAll() {
        return vegetableRepository.findAll();
    }

    @Override
    public Vegetable getVegetableById(Long id) {
        return vegetableRepository.findById(id).orElse(null);
    }

    @Override
    public Vegetable saveVegetable(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public void deleteVegetable(Long id) {
        vegetableRepository.deleteById(id);
    }

    @Override
    public List<Vegetable> getAllVegetableByPriceAsc() {
        return vegetableRepository.findAllByPriceAsc();
    }

    @Override
    public List<Vegetable> getAllVegetableByPriceDesc() {
        return vegetableRepository.findAllByPriceDesc();
    }

    @Override
    public List<Vegetable> getVegetableByName(String name) {
        return vegetableRepository.findByNameContaining(name);
    }
}
