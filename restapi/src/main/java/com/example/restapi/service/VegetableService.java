package com.example.restapi.service;

import com.example.restapi.entity.Fruit;
import com.example.restapi.entity.Vegetable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface VegetableService {
    List<Vegetable> getAll();
    Vegetable getVegetableById(Long id);
    Vegetable saveVegetable(Vegetable vegetable);
    void deleteVegetable(Long id);

    List<Vegetable> getAllVegetableByPriceAsc();
    List<Vegetable> getAllVegetableByPriceDesc();
    List<Vegetable> getVegetableByName(String name);
}
