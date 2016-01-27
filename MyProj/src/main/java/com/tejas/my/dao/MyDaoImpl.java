package com.tejas.my.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tejas.my.vo.HelloVo;

@Repository
public class MyDaoImpl implements IMyDao {
	

	public List<String> getMyName() {
		
		List<String> list = new ArrayList<String>();
		list.add("Tejas");
		return list;
	}

}
