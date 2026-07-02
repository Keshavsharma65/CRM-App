package com.example.service;

import com.example.entity.Customer;
import com.example.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public Integer addCustomer(Customer customer) {
        return repository.save(customer).getId();
    }

    @Override
    public Customer findCustomer(Integer id) {
        if (repository.existsById(id)) {
            return repository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Integer updateCustomer(Customer customer) {
        return repository.save(customer).getId();
    }

    @Override
    public void deleteCustomer(Integer id) {
        repository.deleteById(id);
    }
}
