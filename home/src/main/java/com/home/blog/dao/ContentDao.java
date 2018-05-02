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
	 * 查看文章具体内容
	 * @return
	 */
	ContentDO get(Long cid);
	
	/**
	 * 添加文章
	 * @param contentDO
	 */
	void addContentDO(ContentDO contentDO);
	
	/**
	 * 删除文章
	 * @param cid
	 */
	void delContentDO(Long cid);
	
	/**
	 * 更新文章内容
	 * @param contentDO
	 */
	void updateContent(ContentDO contentDO);
}
