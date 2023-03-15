package com.str.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.str.model.Customers;
import com.str.model.Feedback;
@Repository
public interface CustomersDaoI extends JpaRepository<Customers, Integer> {
	List<Customers>findByStateAndCity(String state ,String city );
	List<Customers>findBydate(String date);

	/*
	 * @Query(value ="SELECT id form customers where firstname =:fn ", nativeQuery=
	 * true) List<Customers>getid(@Param("fn") String firstname);
	 */
	@Query(value= " SELECT * FROM Customers WHERE id IN (SELECT id FROM feedback WHERE ratingstar =:rs)" ,nativeQuery= true)
	List<Customers>findStarRatedcustomer(@Param("rs") int ratingstar);
}
