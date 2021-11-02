package com.example.jpa_hibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa_hibernate.entity.Course;
import com.example.jpa_hibernate.repository.CourseRepository;
import com.example.jpa_hibernate.repository.StudentRepository;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
		//studentRepository.saveStudentWithPassport();
		
//		Course course = repository.findById(10001L);
//		
//		logger.info("Course 10001 -> {}", course);
//		
//		repository.save(new Course ("Web sevices"));
//		
//		//repository.deleteById(10001L);
//		repository.playWithEntityManager();
		
		courseRepository.addReviewsForCourse();
	}

}
