package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerRepository;
import com.app.exceptions.ResourceNotFoundException;
import com.app.pojos.Customer;

// CustomerService.java
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        // Implement logic to create a new customer
        return customerRepository.save(customer);
    }

    public List<Customer> getCustomers(int page, int size, String sort, String search) {
        // Implement logic to get customers with pagination, sorting, and searching
        // You may use customerRepository for database interactions
        return customerRepository.findAll();
    }

    public Customer getCustomerById(String customerId) {
        // Implement logic to get a customer by ID
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + customerId));
    }

    public Customer updateCustomer(String customerId, Customer updatedCustomer) {
        // Implement logic to update a customer
        Customer existingCustomer = getCustomerById(customerId);
        // Update existingCustomer properties with updatedCustomer properties
        return customerRepository.save(existingCustomer);
    }

    public void deleteCustomer(String customerId) {
        // Implement logic to delete a customer
        customerRepository.deleteById(customerId);
    }
}
