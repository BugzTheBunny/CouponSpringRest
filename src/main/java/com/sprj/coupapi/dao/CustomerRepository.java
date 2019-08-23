package com.sprj.coupapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprj.coupapi.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findById(long id);

	Customer findByName(String name);
}
