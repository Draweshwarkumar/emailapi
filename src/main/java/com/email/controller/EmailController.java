package com.email.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController

{
	@RequestMapping("/")
	public String welcome() {
		return "hello this is my email api";
	}
	
}
