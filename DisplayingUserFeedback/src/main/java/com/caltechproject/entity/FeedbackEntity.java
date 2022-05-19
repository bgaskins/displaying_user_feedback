package com.caltechproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class FeedbackEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	@NotNull
	private Integer id;
	@Column(name="review")
	private String review;
	@Column(name="rating")
	@NotNull
	private int rating;
	@Column(name="user")
	private String user;
	
	public FeedbackEntity() {
		super();
	}

	public FeedbackEntity(String review, @NotNull int rating, String user) {
		super();
		this.review = review;
		this.rating = rating;
		this.user = user;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "FeedbackEntity [id=" + id + ", review=" + review + ", rating=" + rating + ", user=" + user + "]";
	}

}
