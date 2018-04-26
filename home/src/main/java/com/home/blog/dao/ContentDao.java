package com.home.blog.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.home.blog.domain.ContentDO;

@Mapper
public interface ContentDao {

	/**
	 * 查询文章列表
	 * @return
	 */
	List<ContentDO> contentList(Map<String,Object> param);
	
	/**
	 * 查询条数
	 * @return
	 */
	int count(Map<String, Object> param);
	
	/**
	 * 
	 * @return
	 */
	ContentDO get(Long cid);
}
