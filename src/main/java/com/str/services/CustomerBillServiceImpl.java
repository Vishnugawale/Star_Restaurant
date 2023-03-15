package com.str.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.str.Dao.CustomerBillDaoI;
import com.str.model.CustomerBill;
@Service
public class CustomerBillServiceImpl implements CustomerBillServiceI {
		@Autowired
		private CustomerBillDaoI b;
	
	@Override
	public void addCustomerBilldata(CustomerBill customerBill) {
		// TODO Auto-generated method stub
		b.save(customerBill);
	}

	/*@Override
	public List<CustomerBill> findCustomerBillByname() {
		// TODO Auto-generated method stub
		List<CustomerBill>list = b.findCustomerBillByname();
		return list;*/
	}


