package com.home.system.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.common.util.PageUtils;
import com.home.common.util.Query;
import com.home.system.domain.UserDO;
import com.home.system.service.UserService;

@Controller
@RequestMapping("/sys/user/")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("")
	String user(){
		return "system/user/user";
	}
	
	@GetMapping("list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params){
		Query query = new Query(params);
		List<UserDO> userList = userService.list(query);
		int count = userService.count();
		PageUtils pageUtils = new PageUtils(count, userList);
		return pageUtils;
	}
	
}
