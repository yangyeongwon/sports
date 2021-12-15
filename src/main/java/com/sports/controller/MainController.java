package com.sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sports")
public class MainController {
	
	@GetMapping(value = "main")
	public String mainView(Model model) {
		return "sports/main";
	}
}
