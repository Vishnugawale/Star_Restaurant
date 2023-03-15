package com.str.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.str.model.Price;

@Repository
public interface PriceDaoI extends JpaRepository<Price, Integer>{

}
