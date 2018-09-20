package com.cofeeshop.repository;

import com.cofeeshop.model.Beverage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


@Repository
public interface BeverageRepository extends CrudRepository<Beverage,Integer> {
    Beverage  findBeverageByName(String name);
    Set<Beverage> findByNameIn(Set<String> stringSet);
}
