package com.home.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class MenuController {

	@GetMapping("/menu")
	String menu(){
		return "/menu";
	}
}
