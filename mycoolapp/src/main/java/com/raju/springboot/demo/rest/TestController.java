package com.raju.springboot.demo.rest;


import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello man!"+new Date();
	}

}
