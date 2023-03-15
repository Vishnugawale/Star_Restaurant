package com.str.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.str.model.Feedback;
import com.str.services.FeedbackServiceI;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	private FeedbackServiceI g;
	@PostMapping("/add")
	public void addfeedbackdata(@RequestBody Feedback feedback) {
		g.addfeedbackdata(feedback);
		
	}

}
