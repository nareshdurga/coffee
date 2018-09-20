package com.cofeeshop.service;

import com.cofeeshop.model.Beverage;
import com.cofeeshop.model.Customer;
import com.cofeeshop.repository.BeverageRepository;
import com.cofeeshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class BeverageService {

    @Autowired
    private BeverageRepository beverageRepository;

    public Beverage findBeverageByName(String name){
        return beverageRepository.findBeverageByName(name);
    }

    public void createBeverage(Beverage beverage){
        beverageRepository.save(beverage);
    }

    public void updateBeverage(Beverage beverage){
        Beverage beverage1 = this.findBeverageByName(beverage.getName());
        beverage1.setBeverageType(beverage.getBeverageType());
        beverageRepository.save(beverage1);
    }

    public void removeBeverage(String name){
        Beverage beverage = this.findBeverageByName(name);
        beverageRepository.delete(beverage);
    }

    public Set<Beverage> findAllByName(Set<String> beverageName){

       return beverageRepository.findByNameIn(beverageName);
    }
}
