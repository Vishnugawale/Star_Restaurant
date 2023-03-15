package com.str.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.str.Dao.FeedbackDaoI;
import com.str.model.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackServiceI {
	@Autowired
	private FeedbackDaoI f;
	
	@Override
	public void addfeedbackdata(Feedback feedback) {
		// TODO Auto-generated method stub
		f.save(feedback);
		
	}
	
}

	