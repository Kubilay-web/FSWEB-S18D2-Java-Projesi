package com.example.restapi.dao;

import com.example.restapi.entity.Fruit;
import com.example.restapi.entity.Vegetable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable,Long>  {
    List<Vegetable> findAllByOrderByIdDesc();

    List<Vegetable> findAllByOrderByIdAsc();

    List<Vegetable> findByNameContaining(String name);


    @Query("SELECT f FROM Fruit f ORDER BY f.price ASC")
    List<Vegetable> findAllByPriceAsc();

    @Query("SELECT f FROM Fruit f ORDER BY f.price DESC")
    List<Vegetable> findAllByPriceDesc();
}
