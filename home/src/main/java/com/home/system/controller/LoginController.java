package com.home.system.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.common.util.MD5Utils;
import com.home.common.util.R;

@Controller
public class LoginController {

	String prefix = ""; 
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public R ajaxLogin(String username,String password){
		password = MD5Utils.encrypt(username, password);
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
			R ok = R.ok();
			ok.get("code");
			
			return R.ok();
		} catch (AuthenticationException e) {
			return R.error("用户名或密码错误");
		}
	}
	
	@RequestMapping("/index")
	public String index(){
		return "index_v1";
	}
	
}
