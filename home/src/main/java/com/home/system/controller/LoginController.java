package com.home.system.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.blog.controller.BlogController;
import com.home.common.controller.BaseController;
import com.home.common.domain.FileDO;
import com.home.common.domain.Tree;
import com.home.common.service.FileService;
import com.home.common.util.MD5Utils;
import com.home.common.util.R;
import com.home.system.domain.MenuDO;
import com.home.system.service.MenuService;

@Controller
public class LoginController extends BaseController{
	private final Logger logger= LoggerFactory.getLogger(this.getClass());

	String prefix = ""; 
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/")
	public String blog(){
		return "redirect:/blog";
	}
	
	
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
	public String index(Model model){
		//获取用户对应的菜单
		System.out.println(getUserId());
		System.out.println(getUser().getUserId());
		List<Tree<MenuDO>> menus = menuService.list(getUser().getUserId());
		model.addAttribute("menus", menus);
		model.addAttribute("username", getUser().getUsername());
		FileDO fileDO = fileService.get(getUser().getPicId());
		if (fileDO != null && fileDO.getUrl() != null) {
			if (fileService.isExixt(fileDO.getUrl())) {
				model.addAttribute("picUrl", fileDO.getUrl());
			}else {
				model.addAttribute("picUrl", "/img/photo_s.jpg");
			}
		}else {
			model.addAttribute("picUrl", "/img/photo_s.jpg");
		}
		model.addAttribute("name", getUser().getName());
		return "index_v1";
	}
	
	@GetMapping("/main")
	String main(){
		return "main";
	}
	
}
