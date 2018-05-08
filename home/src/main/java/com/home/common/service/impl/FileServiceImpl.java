package com.home.common.service.impl;

import java.io.File;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.common.config.HomeConfig;
import com.home.common.dao.FileDao;
import com.home.common.domain.FileDO;
import com.home.common.service.FileService;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	private FileDao fileDao;
	
	@Autowired
	private HomeConfig homeConfig;

	/**
	 * 查询头像
	 */
	@Override
	public FileDO get(Long picId) {
		return fileDao.get(picId);
	}

	@Override
	public boolean isExixt(String url) {
		boolean isExixt = false;
		if (!StringUtils.isEmpty(url)) {
			String uploadPath = url.replace("/file/", "");
			uploadPath = homeConfig.getUploadPath()+uploadPath;
			File file = new File(uploadPath);
			if (file.exists()) {
				isExixt = true;
			}
		}
		return isExixt;
	}

}
