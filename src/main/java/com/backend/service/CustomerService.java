package com.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.backend.entity.Customer;


public interface CustomerService {
	
	 public Page<Customer> getAllCustomers();
	  public void addCustomer(Customer customer);
	  public Customer findCustomerById(int custId);
	  public void deleteCustomerById(int custId);
	  public List<Customer> searchCustomerByEmail(String email);
	  public List<Customer> searchCustomerByName(String name);
	  public List<Customer> searchCustomerByPartialName(String value);
	  

}
