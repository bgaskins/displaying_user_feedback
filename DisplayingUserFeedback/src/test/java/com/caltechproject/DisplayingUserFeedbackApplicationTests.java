package com.caltechproject;

import javax.persistence.EntityManager;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.caltechproject.entity.FeedbackEntity;
import com.caltechproject.repository.FeedbackRepository;

@SpringBootTest
class DisplayingUserFeedbackApplicationTests {

		@Autowired
		EntityManager entityManager;
		
		@Autowired
		FeedbackRepository feedbackRepository;
		
//		@Autowired
		
		@Test
		void shouldFindByUser() {
			FeedbackEntity
			testFeedback = new FeedbackEntity("Simple Test", 5, "Test");
			entityManager.persist(testFeedback);
			entityManager.flush();
			FeedbackEntity cmp = feedbackRepository.findByUser(testFeedback.getUser());
			assertEquals(cmp.getUser(), testFeedback.getUser());
		}
}
