package com.str.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.str.model.Admin;

@Repository
public interface AdminDaoI extends JpaRepository<Admin, Integer> {
	

}
