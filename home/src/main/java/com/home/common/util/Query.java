package com.home.common.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class Query extends LinkedHashMap<String, Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int offset;
	private int limit;
	public Query(Map<String, Object> parmas) {
		super();
		this.putAll(parmas);
		this.offset = Integer.parseInt(parmas.get("offset").toString());
		this.limit = Integer.parseInt(parmas.get("limit").toString());
		this.put("limit", limit);
		this.put("offset", offset);
		System.out.println(offset/limit + 1);
		this.put("page", offset/limit + 1);
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	

}
