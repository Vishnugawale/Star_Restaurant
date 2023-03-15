package com.str.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import com.str.model.CustomerBill;
import com.str.services.CustomerBillServiceI;

@RestController
@RequestMapping("/customerbill")
public class CustomerBillController {
	@Autowired
	private CustomerBillServiceI c;
	public void addCustomerBillData(@RequestBody CustomerBill customerBill) {
		c.addCustomerBilldata(customerBill);
		
	}
	/*@GetMapping("/bill")
	public List<CustomerBill>findCustomerbillByname(){
		List<CustomerBill>list = c.findCustomerBillByname();
		return list;
	*/
	
	/*@GetMapping("/bill")
	public double calculateBill(@RequestParam int numItems, @RequestParam double unitPrice) {
		return numItems * unitPrice;*/
	}


