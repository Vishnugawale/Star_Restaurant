package com.str.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.str.model.ViewBooking;

@Repository

public interface ViewBookingDaoI extends JpaRepository<ViewBooking, Integer>{

}
