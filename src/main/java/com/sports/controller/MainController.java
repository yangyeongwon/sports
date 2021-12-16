package com.sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sports/main")
public class MainController {
	
	@GetMapping(value = {"", "/"})
	public String mainView(Model model) {
		return "sports/main";
	}
	
	@GetMapping(value = "dialog")
	public String dialogView(Model model) {
		return "sports/fragments/login_dialog";
	}
}
