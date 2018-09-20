package com.cofeeshop.model;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    @OneToOne(targetEntity = Customer.class)
    private  Customer customer;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    @OneToMany(targetEntity = Beverage.class)
    private Set<Beverage> beverageSet = new HashSet<>();

    public void setBeverageSet(Set<Beverage> beverageSet) {
        this.beverageSet = beverageSet;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Set<Beverage> getBeverageSet() {
        return beverageSet;
    }
}
