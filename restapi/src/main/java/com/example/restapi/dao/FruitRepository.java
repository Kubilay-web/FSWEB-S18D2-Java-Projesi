package com.example.restapi.dao;

import com.example.restapi.entity.Fruit;
import com.example.restapi.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Long> {
    List<Fruit> findAllByOrderByIdDesc();

    List<Fruit> findAllByOrderByIdAsc();

    List<Fruit> findByNameContaining(String name);


    @Query("SELECT f FROM Fruit f ORDER BY f.price ASC")
    List<Fruit> findAllByPriceAsc();

    @Query("SELECT f FROM Fruit f ORDER BY f.price DESC")
    List<Fruit> findAllByPriceDesc();

}
