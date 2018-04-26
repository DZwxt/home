package com.home.blog.service;



import java.util.List;
import java.util.Map;

import com.home.blog.domain.ContentDO;

public interface ContentService {

	/**
	 * 获取所有文章
	 * @return
	 */
	public List<ContentDO> getContentList(Map<String, Object> param);
	
	/**
	 * 查询所有的条数
	 * @param param
	 * @return
	 */
	int count(Map<String, Object> params);
	
	/**
	 * 根据id查询文章详情
	 * @param cid
	 * @return
	 */
	ContentDO get(Long cid);
}
