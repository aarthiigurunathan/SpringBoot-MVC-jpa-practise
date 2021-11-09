package com.restfulapijpa.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapijpa.studentmanagement.entity.Contact;
import com.restfulapijpa.studentmanagement.entity.Student;
import com.restfulapijpa.studentmanagement.repository.FeignServiceUtil;
import com.restfulapijpa.studentmanagement.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private FeignServiceUtil feignService;
	
	@Autowired
	StudentRepository studentRepository;

	@GetMapping("/contact")
	public List<Contact> findContacts(){
		return feignService.getContact();
	}
	
	@GetMapping("/student")
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@GetMapping("/student/{id}")
	public Student findById(@PathVariable Long id) {
		Student student = studentRepository.findById(id);
		return student;
	}

	@PostMapping("/student")
	public void save(@RequestBody Student student) {
		studentRepository.save(student);
	}

	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable Long id) {

		Student student = studentRepository.findById(id);

		if (student == null)
			throw new StudentNotFoundException("id");

		else {
			studentRepository.deleteById(id);
		}
	}

	@PutMapping("/student")
	public void update(@RequestBody Student student) {
		studentRepository.update(student);
	}
}
