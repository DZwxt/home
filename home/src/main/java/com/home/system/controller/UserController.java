package com.home.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class UserController {

	String user(){
		return "system/user/user";
	}
	
}
