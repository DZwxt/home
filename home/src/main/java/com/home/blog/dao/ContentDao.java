package com.home.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.home.blog.domain.ContentDO;

@Mapper
public interface ContentDao {

	/**
	 * 查询文章列表
	 * @return
	 */
	List<ContentDO> contentList();
}
