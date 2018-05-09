package com.home.common.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.common.domain.DictDO;
import com.home.common.service.DictService;
import com.home.common.util.Query;

@Controller
@RequestMapping("/common/sysDict")
public class DictController {

	@Autowired
	private DictService dictService;
	
	@GetMapping("")
	public String sysDict(){
		return "common/sysDict/sysDict";
	}
	
	
	
	@GetMapping("/list")
	@ResponseBody
	public List<DictDO> list(@RequestParam Map<String, Object> params){
		Query query = new Query(params);
		
		return null;
	}
	
	@RequestMapping("/type")
	@ResponseBody
	public List<DictDO> type(){
		return dictService.listType();
	}
}
