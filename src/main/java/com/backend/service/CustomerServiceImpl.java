package com.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.backend.Repo.CustomerdetailsRepo;
import com.backend.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerdetailsRepo customerRepo;
	@Override
	public Page<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		customerRepo.save(customer);
		
	}

	@Override
	public Customer findCustomerById(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomerById(int custId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> searchCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> searchCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> searchCustomerByPartialName(String value) {
		// TODO Auto-generated method stub
		return null;
	}

}


	
