package com.str.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.str.Dao.ViewBookingDaoI;
import com.str.model.ViewBooking;
@Service
public class ViewBookingServiceImpl implements ViewBookingServiceI  {

	@Autowired
	private ViewBookingDaoI b;
	@Override
	public void addbookingdata(ViewBooking booking) {
		// TODO Auto-generated method stub
		b.save(booking);
		
	}

}
