package com.str.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.str.exception.CustomersNotFoundException;
import com.str.model.Rating;
import com.str.services.RatingServiceI;

@RestController
@RequestMapping("/rating")
public class RatingController {
	@Autowired
	private RatingServiceI s;
	private String rating_firstname;

	@PostMapping("/add")
	public void addRatingdata(@RequestBody Rating rating) {
		s.addRatingdata(rating);

	}

	@GetMapping("/findAll")
	public ResponseEntity<?> searchByRating() throws CustomersNotFoundException  {
		List<Rating> r  = s.findByRating();
		return new ResponseEntity<> (r,HttpStatus.OK);
		
	}

	/*
	 * @GetMapping("/findByrating/{firstname}") public List<Rating>searchByRating(){
	 * List<Rating>list = s.findByRating(rating_firstname); return list; }
	 */
}
