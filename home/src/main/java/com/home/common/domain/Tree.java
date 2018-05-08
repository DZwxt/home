package com.home.common.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class Tree<T> {
	/**
	 * 文本
	 */
	private String text;
	
	/**
	 * 节点id
	 */
	private String id;
	
	/**
	 * 是否有父节点
	 */
	private boolean hasParent = false;
	
	/**
	 * 是否有子节点
	 */
	private boolean hasChildren = false;
	
	/**
	 * 是否被选中 ,ture false
	 */
	private boolean checked = false;
	
	/**
	 * 节点状态  ，open,close
	 */
	private Map<String, Object> state;
	
	/**
	 * 节点属性
	 */
	private Map<String, Object> attributes;
	
	/**
	 * 节点的子节点
	 */
	private List<Tree<T>> children = new ArrayList<Tree<T>>();
	
	/**
	 * 节点的父ID
	 */
	private String parentId;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isHasParent() {
		return hasParent;
	}

	public void setHasParent(boolean hasParent) {
		this.hasParent = hasParent;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Map<String, Object> getState() {
		return state;
	}

	public void setState(Map<String, Object> state) {
		this.state = state;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public List<Tree<T>> getChildren() {
		return children;
	}

	public void setChildren(List<Tree<T>> children) {
		this.children = children;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Tree(String text, String id, boolean hasParent, boolean hasChildren,
			boolean checked, Map<String, Object> state,
			Map<String, Object> attributes, List<Tree<T>> children,
			String parentId) {
		super();
		this.text = text;
		this.id = id;
		this.hasParent = hasParent;
		this.hasChildren = hasChildren;
		this.checked = checked;
		this.state = state;
		this.attributes = attributes;
		this.children = children;
		this.parentId = parentId;
	}

	public Tree() {
		super();
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
	
}
