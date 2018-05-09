package com.home.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class DeptController {

	@GetMapping("/sysDept")
	public String dept(){
		return "system/dept/dept";
	}
}
