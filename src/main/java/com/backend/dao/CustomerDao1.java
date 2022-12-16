package com.backend.dao;

import java.util.Map;

import com.backend.entity.Customer;


public interface CustomerDao1 {
	
	public Map<Integer, Customer> getAllCustomers();	

	 public void addCustomer(Customer customer);
	 public Customer findCustomerById(int custId);
	 public void deleteCustomerById(int custId);

}
