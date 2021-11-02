package com.example.jpa_hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;

	private String description;

	@ManyToOne
	private Course course;
	
	private String rating;

	protected Review() {

	}

	public Review(String rating, String description) {
		this.rating = rating;
		this.description = description;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String name) {
		this.description = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return String.format("Review[%s %s]", rating, description);

	}
}