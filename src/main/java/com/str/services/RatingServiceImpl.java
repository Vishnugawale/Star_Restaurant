package com.str.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.str.Dao.CustomersDaoI;
import com.str.Dao.RatingDaoI;
import com.str.model.Rating;
@Service
public class RatingServiceImpl implements RatingServiceI{
	@Autowired
	private RatingDaoI r;
	@Autowired
	private CustomersDaoI c;
	
	@Override
	public void addRatingdata(Rating rating) {
		// TODO Auto-generated method stub
		r.save(rating);
	}
	/*
	 * @Override public List<Rating> findByRating(String rating_firstname) { // TODO
	 * Auto-generated method stub List<Rating>list =
	 * r.findByRating(rating_firstname); return list; }
	 */
	
	
	  @Override public List<Rating> findByRating() {
		  // TODOAuto-generated method stub
	  List<Rating>list =r.findAll(); 
	  return list; 
	  }
	 
	 
}
