package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/demo")
	public ResponseEntity<String> demoMethod() {
		return new ResponseEntity<String>("Test message from Demo Application", HttpStatus.OK);
	}
}