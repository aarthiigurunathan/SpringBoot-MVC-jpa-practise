package com.restfulapijpa.studentmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue
	private Long id;

	private String student;

	private String department;

	public Student() {

	}

	public Student(String student, String department) {
		super();
		this.student = student;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", student=" + student + ", department=" + department + "]";
	}

}