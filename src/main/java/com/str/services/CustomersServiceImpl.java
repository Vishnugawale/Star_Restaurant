package com.str.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.str.Dao.CustomersDaoI;
import com.str.Dao.FeedbackDaoI;
import com.str.model.Customers;
import com.str.model.Feedback;

@Service
public class CustomersServiceImpl implements CustomerServiceI {
	@Autowired
	private CustomersDaoI c;
	@Autowired
	private FeedbackDaoI d;
	
	
	@Override
	public Customers bookTable(Customers customers) {
		// TODO Auto-generated method stub
		c.save(customers);
		return customers;
	}

	@Override
	public List<Customers> findByStateAndCity(String state, String city) {
		// TODO Auto-generated method stub
		List<Customers> list1 = c.findByStateAndCity(state, city);
		return list1;
	}

	@Override
	public List<Customers> viewBooking(String date) {
		// TODO Auto-generated method stub

		List<Customers> list = c.findBydate(date);
		return list;
	}

	@Override
	public List<Customers> findBycustomersfirstname() {
		// TODOAuto-generated method stub
		List<Customers> list = c.findAll();
		return list;
	}

	@Override
	public List<Feedback> starRatedcustomer(String firstname) {
		// TODO Auto-generated method stub
		List<Feedback>list = d.getratingstar(firstname);
		return list;
	}

	@Override
	public List<Customers> getcustomerrating(int rating) {
		// TODO Auto-generated method stub
		List<Customers>list = c.findStarRatedcustomer(rating);
		return list;
	}

}
