package com.home.blog.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.blog.domain.ContentDO;
import com.home.blog.service.ContentService;
import com.home.common.util.DateUtils;
import com.home.common.util.PageUtils;
import com.home.common.util.Query;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private ContentService contentService;
	
	/**
	 * 跳转到博客主页
	 * @return
	 */
	@GetMapping()
	public String blog(){
		System.out.println(123);
		return "blog/index/main";
	}
	
	/**
	 * 博客列表页面
	 * @param type
	 * @param limit
	 * @param offset
	 * @return
	 */
	@GetMapping("/open/list")
	@ResponseBody
	public PageUtils contentDOList(@RequestParam Map<String, Object> params){
		//查询参数
		Query query = new Query(params);
		List<ContentDO> list = contentService.getContentList(query);
		int total = contentService.count(query);
		PageUtils page = new PageUtils(total, list);
		return page;
	}
	
	@GetMapping("/open/post/{cid}")
	public String contentDetail(@PathVariable Long cid,Model model){
		ContentDO contentDO = contentService.get(cid);
		model.addAttribute("bContent", contentDO);
		model.addAttribute("gtmModified", DateUtils.format(contentDO.getGtmCreate()));
		return "blog/index/post";
	}
	
}
