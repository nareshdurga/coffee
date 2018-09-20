package com.cofeeshop.service;

import com.cofeeshop.model.Customer;
import com.cofeeshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer findCustomerByNameOrMobile(String name, String mobile){
        return customerRepository.findCustomerByNameOrMobile(name,mobile);
    }

    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public void updateCustomer(Customer customer){
        Customer customer1 = this.findCustomerByNameOrMobile(customer.getName(),customer.getMobile());
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setMobile(customer.getMobile());
        customer1.setEmail(customer.getEmail());
        customerRepository.save(customer1);
    }

    public void removeCustomer(String name, String mobile){
        Customer customer1 = this.findCustomerByNameOrMobile(name,mobile);
        customerRepository.delete(customer1);
    }

}
