package com.caltechproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caltechproject.entity.FeedbackEntity;
import com.caltechproject.repository.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	FeedbackRepository feedbackRepository;
	public Iterable<FeedbackEntity> GetAllFeedback() {
		return feedbackRepository.findAll();
	}
	public FeedbackEntity addNewFeedback(FeedbackEntity fb) {
		return feedbackRepository.save(fb);
	}


}
