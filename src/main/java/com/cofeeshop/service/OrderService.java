package com.cofeeshop.service;

import com.cofeeshop.model.Beverage;
import com.cofeeshop.model.Customer;
import com.cofeeshop.model.Order;
import com.cofeeshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderService  {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private  CustomerService customerService;

    @Autowired
    private  BeverageService beverageService;

    public void placeOrder(String customerName ,String mobile,Set<String> beverageName){
        Customer customer= customerService.findCustomerByNameOrMobile(customerName,mobile);
        Set<Beverage> beverages = beverageService.findAllByName(beverageName);
        Order order = new Order();
        order.setBeverageSet(beverages);
        order.setCustomer(customer);
        orderRepository.save(order);

    }













}
