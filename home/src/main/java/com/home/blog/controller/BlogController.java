package com.home.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@GetMapping()
	public String blog(){
		System.out.println(123);
		return "blog/index/main";
	}
}
