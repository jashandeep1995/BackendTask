package com.backend.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Vehicle {
	
	@Id
	 private int id;
		
		
	 private int year;
	
	 private String make;
	 
	 private int model;
	 
	 //New columns. In this case Hibernate will generate a query to add new columns to the table without affecting the Database design. In this way, we can add more columns.
	 
	 private String color;
	 private int length;
	 private String trim;
	 private int size;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

}
