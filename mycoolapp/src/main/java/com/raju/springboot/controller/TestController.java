package com.raju.springboot.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello man!"+LocalDate.now();
	}

}
