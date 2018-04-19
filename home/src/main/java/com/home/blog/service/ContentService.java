package com.home.blog.service;

import java.util.List;

import com.home.blog.domain.ContentDO;

public interface ContentService {

	/**
	 * 获取所有文章
	 * @return
	 */
	public List<ContentDO> getContentList();
}
