package com.example.jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpa_hibernate.entity.Course;
import com.example.jpa_hibernate.entity.Review;

@Repository
@Transactional
public class CourseRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

	public Course save(Course course) {
		if (course.getId() == null) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		return course;
	}

	public void deleteById(long id) {
		Course course = findById(id);
		em.remove(course);
	}

	public void playWithEntityManager() {
		Course course1 = new Course("Web services");
		em.persist(course1);
		// em.flush();

		Course course2 = new Course("Java app");
		em.persist(course2);
		em.flush();
		// em.clear();
		// em.detach(course2);
		course1.setName("Web services - updated");
		// em.flush();

		course2.setName("Java app - updated");

		em.refresh(course2);
		// em.remove(course2);
		em.flush();

	}

	public void addReviewsForCourse() {
		// get the course 10003
		Course course = findById(10003L);
		logger.info("course.getReviews() -> {}", course.getReviews());

		// add 2 reviews to it
		Review review1 = new Review("5", "Great Hands-on Stuff.");
		Review review2 = new Review("5", "Hatsoff.");

		// setting the relationship
		course.addReview(review1);
		review1.setCourse(course);

		course.addReview(review2);
		review2.setCourse(course);

		// save it to the database
		em.persist(review1);
		em.persist(review2);
	}

}
