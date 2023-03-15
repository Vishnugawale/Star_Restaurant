package com.str.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.str.model.Rating;

@Repository
public interface RatingDaoI extends JpaRepository<Rating, Long>{
	
	  @Query(value = "SELECT * FROM rating WHERE rating_firstname = ?1",nativeQuery= true)
	  List<Rating>findByRating(String rating_firstname);
	 
	 
	/*
	 * @Query(value = " Select cust_name from table_name order by ratring")
	 * List<Rating>findByRating(String rating_firstname);
	 */
}
