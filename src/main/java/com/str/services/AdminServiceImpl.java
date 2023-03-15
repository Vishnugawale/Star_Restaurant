package com.str.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.str.Dao.AdminDaoI;
import com.str.model.Admin;

@Service
public class AdminServiceImpl  implements AdminServiceI {
	@Autowired
	private AdminDaoI a;
	@Override
	public void addadmindata(Admin admin) {
		// TODO Auto-generated method stub
		a.save(admin);
	}

}
