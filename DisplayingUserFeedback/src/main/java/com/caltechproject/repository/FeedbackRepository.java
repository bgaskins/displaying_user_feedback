package com.caltechproject.repository;

import com.caltechproject.entity.FeedbackEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface FeedbackRepository extends CrudRepository<FeedbackEntity, Integer> {
	public FeedbackEntity findByUser(String feedback);
}
