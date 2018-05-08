package com.home.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.home.common.domain.Tree;

/**
 * 构建树
 * @author liming
 *
 */
public class BuildTree {
	
	public static <T> Tree<T> build(List<Tree<T>> nodes){
		
		List<Tree<T>> topNodes = new ArrayList<Tree<T>>();
		
		if (nodes == null) {
			return null;
		}
		for(Tree<T> children : nodes ){
			String parentId = children.getParentId();
			if (parentId != null && parentId.equals("0")) {
				topNodes.add(children);
				continue;
			}
			
			for(Tree<T> parent : nodes){
				String id = parent.getId();
				if (id!= null && id.equals(parentId)) {
					parent.getChildren().add(children);
					parent.setHasChildren(true);
					children.setHasParent(true);
					continue;
				}
			}
			
		}
		
		Tree<T> root = new Tree<T>();
		if (topNodes.size() == 1) {
			root = topNodes.get(0);
		}else {
			root.setId("-1");
			root.setParentId("");
			root.setHasChildren(true);
			root.setChecked(true);
			root.setHasParent(false);
			root.setText("顶级节点");
			root.setChildren(topNodes);
			Map<String, Object> state = new HashMap<String, Object>();
			state.put("opened", true);
			root.setState(state);
		}
		
		return root;
	}
	
	
	public static <T> List<Tree<T>> buildList(List<Tree<T>> nodes,String idParam){
		
		if (nodes == null) {
			return null;
		}
		
		List<Tree<T>> nodeList = new ArrayList<Tree<T>>();
		for(Tree<T> children: nodes){
			String parentId = children.getParentId();
			if (parentId==null || idParam.equals(parentId)) {
				nodeList.add(children);
				continue;
			}
			
			for(Tree<T> parent : nodes){
				String id = parent.getId();
				if (id != null && id.equals(parentId)) {
					parent.getChildren().add(children);
					parent.setHasChildren(true);
					children.setHasParent(true);
					continue;
				}
			}
		}
		return nodeList;
	}
}
