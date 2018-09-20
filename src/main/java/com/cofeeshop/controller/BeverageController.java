package com.cofeeshop.controller;

import com.cofeeshop.model.Beverage;
import com.cofeeshop.model.Customer;
import com.cofeeshop.service.BeverageService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/beverage/service")
public class BeverageController {

    private BeverageService beverageService;

    @GetMapping("/get/{name}")
    @ResponseBody
    public Beverage getCustomer(@PathParam("name") String name){
        return beverageService.findBeverageByName(name);
    }

    @PostMapping("/save")
    public String createCustomer(@RequestBody Beverage beverage){
        beverageService.createBeverage(beverage);
        return "";
    }

    @PutMapping("/update")
    public String updateCustomer(@RequestBody Beverage beverage){
        beverageService.updateBeverage(beverage);
        return "";
    }
    @DeleteMapping("delete/{name}")
    public String remove(@PathParam("name") String name){
        beverageService.removeBeverage(name);
        return "";
    }
}
