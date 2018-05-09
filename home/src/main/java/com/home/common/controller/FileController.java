package com.home.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys/sysFile")
public class FileController {

	@GetMapping("/")
	public String sysFile(){
		return "common/file/file";
	}
}
