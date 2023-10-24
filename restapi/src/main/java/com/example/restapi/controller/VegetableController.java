package com.example.restapi.controller;


import com.example.restapi.entity.Vegetable;
import com.example.restapi.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vegetables")
public class VegetableController {
    @Autowired
    private VegetableService vegetableService;

    @GetMapping
    public List<Vegetable> getAll(){
        return vegetableService.getAllVegetableByPriceAsc();
    }

    @GetMapping("/{id}")
    public Vegetable getVegetableById(@PathVariable Long id){
        return vegetableService.getVegetableById(id);
    }

    @GetMapping("/{desc}")
    public List<Vegetable> getAllVegetableByPriceDesc(){
        return vegetableService.getAllVegetableByPriceDesc();
    }

    @PostMapping("/{name}")
    public List<Vegetable> getVegetableName(@PathVariable String name){
        return vegetableService.getVegetableByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteVegetable(@PathVariable Long id) {
        vegetableService.deleteVegetable(id);
    }

}
