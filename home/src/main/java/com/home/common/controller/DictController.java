package com.home.common.controller;


import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.common.domain.DictDO;
import com.home.common.service.DictService;
import com.home.common.util.PageUtils;
import com.home.common.util.Query;
import com.home.common.util.R;

@Controller
@RequestMapping("/common/sysDict")
public class DictController {

	private String prefix = "common/sysDict/";

	@Autowired
	private DictService dictService;
	
	@GetMapping("")
	public String sysDict(){
		return prefix + "sysDict";
	}
	

	
	@GetMapping("/list")
	@ResponseBody
	public PageUtils list(@RequestParam Map<String, Object> params){
		Query query = new Query(params);
		List<DictDO> dictList = dictService.list(query);
		int count = dictService.count(query);
	    PageUtils pageUtils = new PageUtils(count, dictList);
		return pageUtils;
	}
	
	@RequestMapping("/type")
	@ResponseBody
	public List<DictDO> type(){
		return dictService.listType();
	}
	
	@GetMapping("/edit/{id}")
	String edit(@PathVariable("id") Long id,Model model){
		DictDO dictDO = dictService.getById(id);
		model.addAttribute("sysDict", dictDO);
		return prefix+"edit";
	}
	
	@PostMapping("/update")
	@ResponseBody
	R update(DictDO dictDO){
		R update = dictService.update(dictDO);
		return update;
	}
	
	@PostMapping("/remove")
	@ResponseBody
	R remove(Long id){
		R delete = dictService.delete(id);
		return delete;
	}
	
	// 类别已经指定增加
	@GetMapping("/add/{type}/{description}")
	@RequiresPermissions("common:sysDict:add")
	String addD(Model model, @PathVariable("type") String type, @PathVariable("description") String description) {
		model.addAttribute("type", type);
		model.addAttribute("description", description);
		return "common/sysDict/add";
	}		
}
