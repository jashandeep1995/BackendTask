package com.backend.service;



import java.util.List;

import org.springframework.data.domain.Page;

import com.backend.Repo.VehicledetailsRepo;
import com.backend.entity.Vehicle;



public class VehicleImpl implements VehicleService {

	VehicledetailsRepo vehicleRepo;
	@Override
	public Page<Vehicle> getAllVehicles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
		vehicleRepo.save(vehicle);
		
		
	}

	@Override
	public Vehicle findVehicleById(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVehicleById(int custId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vehicle> searchVehicleByModel(String model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> searchVehicleByMake(String make) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> searchVehicleByYear(String year) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
