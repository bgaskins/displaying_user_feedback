package com.caltechproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.caltechproject.entity.FeedbackEntity;
import com.caltechproject.service.FeedbackService;



@Controller
public class TestFormController {

	@Autowired
	FeedbackService feedbackService;
	@GetMapping("/test_form")
	public String showTestForm(ModelMap model) {
		model.addAttribute("test", new FeedbackEntity());
		return "index";
	}
	@PostMapping("/test_form")
	public String submitTestForm(@ModelAttribute("testUser") FeedbackEntity fb, ModelMap m) {
		feedbackService.addNewFeedback(fb);
		m.addAttribute("test", fb);
			return "post";
	}
}
