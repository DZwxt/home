package com.home.blog.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.blog.dao.ContentDao;
import com.home.blog.domain.ContentDO;
import com.home.blog.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService{
	
	@Autowired
	private ContentDao contentDao;

	/**
	 * 查询所有的文章列表
	 */
	@Override
	public List<ContentDO> getContentList(Map<String, Object> param) {
		List<ContentDO> list = contentDao.contentList(param);
		return list;
	}

	/**
	 * 查询文章总数
	 */
	@Override
	public int count(Map<String, Object> params) {
		int count = contentDao.count(params);
		
		return count;
	}

	@Override
	public ContentDO get(Long cid) {
		ContentDO contentDO = contentDao.get(cid);
		return contentDO;
	}

}
