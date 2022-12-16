package com.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.backend.entity.Vehicle;

public interface VehicleService {
	
	 public Page<Vehicle> getAllVehicles();
	  public void addVehicle(Vehicle vehicle);  //will add the new vehicle info to the database
	  public Vehicle findVehicleById(int custId); //will find the Vehicle in the database using Id
	  public void deleteVehicleById(int custId);// will delete the vehicle by Id
	  public List<Vehicle> searchVehicleByModel(String model);//will search the vehicle by model
	  public List<Vehicle> searchVehicleByMake(String make);
	  public List<Vehicle> searchVehicleByYear(String year);

}
