package com.demo.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
	
	@GetMapping("/")
	public String dashboard() {
		return "Dashboard";
	}

}
