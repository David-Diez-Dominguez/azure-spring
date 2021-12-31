package com.demo.azure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {
	
	@GetMapping("/")
	public String showDashboard() {
		return "dashboard";
	}

}
