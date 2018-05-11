package com.home.common.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.home.common.dao.DictDao;
import com.home.common.domain.DictDO;
import com.home.common.service.DictService;
import com.home.common.util.Query;
import com.home.common.util.R;

@Component
public class DictServiceImpl implements DictService{

	@Autowired
	private DictDao dictDao;
	
	@Override
	public List<DictDO> listType() {
		return dictDao.listType();
	}

	@Override
	public List<DictDO> list(Query query) {
		List<DictDO> list = dictDao.list(query);
		return list;
	}

	@Override
	public int count(Map<String, Object> map) {
		return dictDao.count(map);
	}

	@Override
	public DictDO getById(Long id) {
		return dictDao.getById(id);
	}

	@Override
	public R update(DictDO dictDO) {
		int update = dictDao.update(dictDO);
		if (update>0) {
			return R.ok();
		}else {
			return R.error("更新失败");
		}
	}

	@Override
	public R delete(Long id) {
		int delete = dictDao.delete(id);
		if (delete>0) {
			return R.error(0, "删除成功");
		}else {
			return R.error("删除失败");
		}
	}

	@Override
	public R deleteBatch(Long[] ids) {
		int deleteBatch = dictDao.deleteBatch(ids);
		if (deleteBatch>0) {
			return R.error(0, "删除成功");
		}else {
			return R.error("删除失败");
		}
	}

}
