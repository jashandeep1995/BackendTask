
package com.backend.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Customer {
	
	@Id
	private int Phone;
	private String first_name;
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	private String last_name;

}
