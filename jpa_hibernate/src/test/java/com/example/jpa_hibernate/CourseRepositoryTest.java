package com.example.jpa_hibernate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.jpa_hibernate.entity.Course;
import com.example.jpa_hibernate.repository.CourseRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes=JpaHibernateApplication.class)
class CourseRepositoryTest {

	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	@Test
	public void findById_basic() {
		Course course = repository.findById(10001L);
		assertEquals("jpa demo", course.getName());
	}
	
	@Test
	@DirtiesContext
	public void deleteById_basic() {
		repository.deleteById(10002L);
		assertNull(repository.findById(10002L));
	}

	@Test
	@DirtiesContext
	public void save_basic() {
		Course course = repository.findById(10001L);
		assertEquals("jpa demo", course.getName());
		course.setName("jpa dem - updated");
		repository.save(course);
		Course course1 = repository.findById(10001L);
		assertEquals("jpa dem - updated", course1.getName());
	}
	
	@Test
	@DirtiesContext
	public void playWithEntityManager() {
		repository.playWithEntityManager();
	}
	
}
