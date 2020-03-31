package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ss.entity.Customer;
import com.ss.repository.CustomerRepository;

public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	public List<Customer> getAllCustomer(){
		return customerRepository.getAllCustomer();
	}
}
