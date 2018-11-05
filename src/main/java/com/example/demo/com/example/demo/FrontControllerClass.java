package com.example.demo.com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class FrontControllerClass {
	
	@RequestMapping("/hello")
	public String printSomething() {
		System.out.println("In FrontController Class");
		return "First spring boot application succesfully launched";
		
	}
}
