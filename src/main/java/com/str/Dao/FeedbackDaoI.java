package com.str.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.str.model.Feedback;

public interface FeedbackDaoI extends JpaRepository<Feedback, Integer> {
	@Query(value= " SELECT * FROM feedback WHERE id IN (SELECT id FROM customers WHERE ratingstar =:rs)" ,nativeQuery= true)
	List<Feedback>getratingstar(@Param("rs") String ratingstar);
}
