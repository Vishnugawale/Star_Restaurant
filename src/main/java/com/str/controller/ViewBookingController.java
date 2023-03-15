package com.str.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.str.model.Customers;
import com.str.model.ViewBooking;
import com.str.services.ViewBookingServiceI;

@RestController
@RequestMapping("/booking")
public class ViewBookingController {
	
	@Autowired
	private ViewBookingServiceI t;
	
	@PostMapping("/add")
	@HystrixCommand(fallbackMethod = "add_fallBack")
	public void addViewbookingdata(@RequestBody ViewBooking booking) {
		t.addbookingdata(booking);
	}

	public ResponseEntity<?> add_fallBack(@RequestBody ViewBooking viewbooking) {
		return new ResponseEntity<>("Booking or add service is not running.......", HttpStatus.NOT_FOUND);
}
}