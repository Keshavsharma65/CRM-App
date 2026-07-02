package com.example.controller;

import com.example.entity.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/add")
    public String addCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "addCustomer";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute Customer customer) {
        customerService.addCustomer(customer);
        return "redirect:/view";
    }

    @GetMapping("/view")
    public String viewAllCustomers(Model model) {
        List<Customer> allcustomers = customerService.findAllCustomers();
        model.addAttribute("customers", allcustomers);
        return "allCustomers";
    }

    @GetMapping("/update/{id}")
    public String updateCustomer(@PathVariable("id") Integer id, Model model) {
        Customer customer = customerService.findCustomer(id);
        model.addAttribute("customer", customer);
        return "updateCustomer";
    }

    @PostMapping("/updatesave")
    public String updateCustomer(@ModelAttribute Customer customer) {
        customerService.updateCustomer(customer);
        System.out.println("ID : " + customer.getId());
        return "redirect:/view";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id) {
        customerService.deleteCustomer(id);
        return "redirect:/view";
    }
}
