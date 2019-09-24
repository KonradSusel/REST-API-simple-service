package com.hsbc.restapi.controller;

import com.hsbc.restapi.model.Customer;
import com.hsbc.restapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        customerRepository.store(customer);
    }

    @GetMapping
    public Map<Integer, Customer> retrieveAllCustomers() {
        return customerRepository.retrieveAllCustomers();
    }

    @GetMapping(path = "/{id}")
    public Customer retrieveCustomerById(@PathVariable(value = "id") int customerId) {
        return customerRepository.retrieveCustomerById(customerId);
    }

}
