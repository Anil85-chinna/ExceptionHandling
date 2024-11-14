package com.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
