package com.common.collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CommonVOList<T> extends ArrayList<T>{
	
	// serialVersionID
	private static final long serialVersionUID = 1L;
	
	// -----------   Constructor  -----------
	
	public CommonVOList() {
		super();
	}
	
	@SuppressWarnings("unchecked")
	public CommonVOList(List<?> list) {
		list.forEach(v -> this.add((T)v));
	}	
}
