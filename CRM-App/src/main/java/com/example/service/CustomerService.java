package com.example.service;

import com.example.entity.Customer;

import java.util.List;

public interface CustomerService {
    Integer addCustomer(Customer customer);

    Customer findCustomer(Integer id);

    List<Customer> findAllCustomers();

    Integer updateCustomer(Customer customer);

    void deleteCustomer(Integer id);

}
