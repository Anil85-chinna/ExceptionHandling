package com.anil.serviceIml;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.exceptions.CustomerAlreadyExistingException;
import com.anil.model.Customer;
import com.anil.repo.CustomerRepo;
import com.anil.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	


	@Override
	public String addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer existingCustomer=customerRepo.findById(customer.getId()).orElse(null);
		if(existingCustomer!=null) {
			customerRepo.save(customer);
			return "Added done savely";
		}
		else {
			throw new CustomerAlreadyExistingException("Customer alredy added");
		}
	}

	@Override
	public String updateCustomer(Customer customer) {
		Customer existingCustomer=customerRepo.findById(customer.getId()).orElse(null);
		if(existingCustomer!=null) {
			existingCustomer.setName(customer.getName());
			existingCustomer.setAddress(customer.getAddress());
			customerRepo.save(existingCustomer);
			return "Updated the customer";
		}else {
			throw new NoSuchElementException("No Id found using that id");	
		}
	}

	@Override
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		 return customerRepo.findById(id).orElseThrow(()->new NoSuchElementException("No Element found with id "+id));
	}

}
