package com.str.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.str.Dao.PriceDaoI;
import com.str.model.Price;

@Service
public class PriceServiceImpl implements PriceServiceI {
	@Autowired
	private PriceDaoI p;
	
	@Override
	public void addpricedata(Price price) {
		// TODO Auto-generated method stub
		p.save(price);
		
	}

}
