package com.insomniomonterrey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String getHome() {
		return "index";
	}
	
	@RequestMapping(value="/contacto")
	public String getContact() {
		return "contacto";
	}
	
}
