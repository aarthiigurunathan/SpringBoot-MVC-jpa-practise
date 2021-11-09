package com.restfulapijpa.studentmanagement.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.restfulapijpa.studentmanagement.entity.Contact;

//@FeignClient(value="feignDemo",url="http://localhost:8080")
@FeignClient(name="contact-management" )
public interface FeignServiceUtil {
	@GetMapping("/contact")
	List<Contact> getContact();
	
}