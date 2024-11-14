package com.anil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anil.model.Customer;
import com.anil.serviceIml.CustomerServiceImpl;

@RestController
//@RequestMapping("/customer")
public class customerController {
	
	@Autowired
	private CustomerServiceImpl impl;
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") Integer id){
		Customer customer=impl.getCustomer(id);
		ResponseEntity.status(HttpStatus.FOUND).body(customer);
		return ResponseEntity.ok().build();
	}
	
	/*@PostMapping("/addcus")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		String body1=impl.addCustomer(customer);
		ResponseEntity.status(HttpStatus.CREATED).body(body1);
		return ResponseEntity.ok().build();
	}*/
	
	@PostMapping("/add")
	public String addCustimer(@RequestBody Customer customer) {
		return impl.addCustomer(customer);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		String body1=impl.addCustomer(customer);
		ResponseEntity.status(HttpStatus.UPGRADE_REQUIRED).body(body1);
		return ResponseEntity.ok().build();
		
	}
	
	

}
