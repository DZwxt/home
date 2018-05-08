package com.home.common.dao;

import com.home.common.domain.FileDO;

/**
 * 文件
 * @author liming
 *
 */
public interface FileDao {
	/**
	 * 获取用户头像
	 * @param id
	 * @return
	 */
	FileDO get(Long id);
}
