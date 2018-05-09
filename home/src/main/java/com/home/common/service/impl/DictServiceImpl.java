package com.home.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.home.common.dao.DictDao;
import com.home.common.domain.DictDO;
import com.home.common.service.DictService;

@Component
public class DictServiceImpl implements DictService{

	@Autowired
	private DictDao dictDao;
	
	@Override
	public List<DictDO> listType() {
		return dictDao.listType();
	}

}
