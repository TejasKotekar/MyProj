package com.tejas.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejas.my.dao.IMyDao;
import com.tejas.my.vo.HelloVo;


@Service
public class MyServiceImpl implements IMyService {
	
	@Autowired
	IMyDao iMyDao;

	public List<String> getMyName() {
		List<String> list = this.iMyDao.getMyName();
		  return  list ;
		
	}

	
	
}
