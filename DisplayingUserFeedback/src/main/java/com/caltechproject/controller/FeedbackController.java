package com.caltechproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.caltechproject.entity.FeedbackEntity;
import com.caltechproject.service.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	FeedbackService feedbackService;
	
	@GetMapping("/feedback")
	public Iterable<FeedbackEntity> getAllFeedbacks(){
		return feedbackService.GetAllFeedback();
	}
	@PostMapping(path="/feedback", consumes= {MediaType.APPLICATION_JSON_VALUE}) 
	public FeedbackEntity addNewFeedback(@RequestBody FeedbackEntity fb) {
		FeedbackEntity newFb = new FeedbackEntity(fb.getReview(), fb.getRating(), fb.getUser());
		feedbackService.addNewFeedback(newFb);
		return newFb;
	}

}
