package com.home.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.common.domain.Tree;
import com.home.system.domain.DeptDO;
import com.home.system.service.impl.DeptService;

@Controller
@RequestMapping("/system/sysDept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	@GetMapping("")
	public String dept(){
		return "system/dept/dept";
	}
	
	@GetMapping("/tree")
	@ResponseBody
    Tree<DeptDO> tree(){
		Tree<DeptDO> listTree = deptService.listTree();
    	return listTree;
    }
	
	
}
