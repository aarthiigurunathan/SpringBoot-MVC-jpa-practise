package com.restfulapijpa.studentmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Department {
	@Id
	private String department;
	private String subject;

	protected Department() {
	}

	public Department(String department, String subject) {
		super();
		this.department = department;
		this.subject = subject;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Department [department=" + department + ", subject=" + subject + "]";
	}
}
