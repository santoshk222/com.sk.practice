package com.sk.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Value("${spring.application.name}")
	String appName;

	@Value("${spring.application.myname}")
	String myname;

	@RequestMapping(value = "/")
	public String welcme(Model model) {
		System.out.println("Hello /home");
		model.addAttribute("appName", appName);
		model.addAttribute("myname", myname);
		return "home";

	}
}
