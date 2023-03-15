package com.str.services;

import java.util.List;

import com.str.model.Rating;

public interface RatingServiceI {
public void addRatingdata(Rating rating);
 List<Rating> findByRating();  
	/* List<Rating>findByRating(String rating_firstname); */
}
