package com.home.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.home.common.domain.DictDO;

@Service
public interface DictService {

	List<DictDO> listType();
}
