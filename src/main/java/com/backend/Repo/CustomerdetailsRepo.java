package com.backend.Repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entity.Customer;

public interface CustomerdetailsRepo extends JpaRepository<CustomerdetailsRepo,Integer> {

	void save(Customer customer);

}
