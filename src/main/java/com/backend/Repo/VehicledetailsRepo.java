package com.backend.Repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entity.Vehicle;

public interface VehicledetailsRepo extends JpaRepository<VehicledetailsRepo,Integer> {

	void save(Vehicle vehicle);

}
