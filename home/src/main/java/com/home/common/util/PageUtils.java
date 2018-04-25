package com.home.common.util;

import java.io.Serializable;
import java.util.List;

/**
 * 分页
 * @author wxt
 *
 */
public class PageUtils implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//总页数
	private long total;
	
	private List<?> rows;

	public PageUtils(long total, List<?> list) {
		super();
		this.total = total;
		this.rows = list;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
