package com.backend.dao;

import java.util.Map;

import com.backend.entity.Vehicle;


public interface VehicleDao1 {
	
	public Map<Integer, Vehicle> getAllVehicles();	

	 public void addVehicle(Vehicle vehicle);
	 public Vehicle findVehicleById(int vehicleId);
	 public void deleteVehicleById(int vehicleId);


}
