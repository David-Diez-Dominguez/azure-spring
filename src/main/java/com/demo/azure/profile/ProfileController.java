package com.demo.azure.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

	
	@GetMapping("/profile")
	public String showFaq(){
		return"html/profile";
	}

}
