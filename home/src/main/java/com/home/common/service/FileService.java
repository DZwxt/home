package com.home.common.service;

import com.home.common.domain.FileDO;

public interface FileService {
	
	/**
	 * 查询对应的头像
	 * @param picId
	 * @return
	 */
	FileDO get(Long picId);
	
	/**
	 * 检查url是否存在
	 * @param url
	 * @return
	 */
	boolean isExixt(String url);

}
