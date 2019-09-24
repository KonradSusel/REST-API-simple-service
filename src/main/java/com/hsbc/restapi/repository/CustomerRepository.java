package com.hsbc.restapi.repository;

import com.hsbc.restapi.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepository {

    private Map<Integer, Customer> repository;

    public CustomerRepository() {
        this.repository = new HashMap<>();
    }

    public void store(Customer customer) {
        repository.put(customer.getId(), customer);
    }

    public Map<Integer, Customer> retrieveAllCustomers() {
        return this.repository;
    }

    public Customer retrieveCustomerById(int customerId) {
        return this.repository.get(customerId);
    }
}
