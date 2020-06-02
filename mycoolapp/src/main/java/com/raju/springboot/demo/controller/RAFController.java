package com.raju.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RAFController {

	@GetMapping("/raf")
	public String hello() {
		return "Hello raf man";
	}
}
