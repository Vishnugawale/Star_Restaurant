package com.str.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.str.Dao.CustomersDaoI;
import com.str.Dao.RatingDaoI;
import com.str.model.Admin;
import com.str.services.AdminServiceI;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminServiceI s;
	@Autowired
	private CustomersDaoI c;
	@Autowired
	private RatingDaoI d;
	@PostMapping("/add")
	public void addadmindata(@RequestBody Admin admin) {
		s.addadmindata(admin);
	}

}
 