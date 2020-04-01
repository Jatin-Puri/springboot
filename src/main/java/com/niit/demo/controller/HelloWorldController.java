package com.niit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Boot";
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/test")
	public String sayHello(@RequestParam("name") String name, Model model) {

		model.addAttribute("name", name);
		return "hello";
	}

}