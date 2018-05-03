package com.home.common.util;

import java.util.HashMap;



public class R extends HashMap<String,Object>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public R(){
		put("msg", "登陆成功");
		put("code", 0);
	}
	
	public static R error(int code,String msg){
		R r = new R();
		r.put("msg", msg);
		r.put("code", code);
		return r;
	}
	
	public static R error(String msg){
		return error(500, msg);
	}
	
	public static R error(){
		return error(1, "操作失败");
	}
	
	public static R ok(){
		return new R();
	}
	
	public static R ok(String msg){
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(HashMap<String, Object> map){
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public R put(String key,Object keyValue){
		super.put(key, keyValue);
		return this;
	}

}
