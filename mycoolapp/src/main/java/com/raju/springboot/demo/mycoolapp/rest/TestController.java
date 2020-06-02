package com.raju.springboot.demo.mycoolapp.rest;


import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${emp.name}")
	private String empName;
	@Value("${emp.message}")
	private String message;
	
	@GetMapping("/")
	public String sayHello() {
		
		return message+" :: "+empName+" Current Date"+new Date();
	}

}
