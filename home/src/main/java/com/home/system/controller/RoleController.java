package com.home.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys/role")
public class RoleController {

	
	@GetMapping("")
	String role(){
		return "system/role/role";
	}
	
	
	
	
}
