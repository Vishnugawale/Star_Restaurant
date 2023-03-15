package com.str.services;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.str.model.Customers;
import com.str.model.Feedback;

public interface CustomerServiceI {
	public Customers bookTable(Customers customers);
	List<Customers> findByStateAndCity(String state , String city );
	
	List<Customers> viewBooking(String date);
	 List<Customers>findBycustomersfirstname(); 
	 List<Feedback>starRatedcustomer(String firstname);
	 List<Customers>getcustomerrating(int rating);
}
