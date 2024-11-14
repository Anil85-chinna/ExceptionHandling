package com.anil.service;

import org.springframework.stereotype.Service;

import com.anil.model.Customer;

@Service
public interface CustomerService {
	
	 Customer getCustomer(Integer id);
	 String addCustomer(Customer customer);
	 String updateCustomer(Customer customer);

}
