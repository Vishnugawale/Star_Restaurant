package com.str.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.str.model.Price;
import com.str.services.PriceServiceI;

@RestController
@RequestMapping("/price")
public class PriceController {
	@Autowired
	private PriceServiceI r;
	@PostMapping("/add")
	public void addprice(@RequestBody Price price) {
		r.addpricedata(price);
	}

}
