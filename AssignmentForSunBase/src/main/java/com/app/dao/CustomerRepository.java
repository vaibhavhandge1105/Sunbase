package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;

// CustomerRepository.java
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
