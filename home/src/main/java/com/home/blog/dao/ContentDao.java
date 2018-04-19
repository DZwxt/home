package com.home.blog.dao;

import java.util.List;

import com.home.blog.domain.ContentDO;

public interface ContentDao {

	/**
	 * 查询文章列表
	 * @return
	 */
	List<ContentDO> contentList();
}
