package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(value = "firstClient")
	public String sayHelloFirstClient() {
		return "Welcome to Spring Micro Service of First Client with Rest App";
	}
}
