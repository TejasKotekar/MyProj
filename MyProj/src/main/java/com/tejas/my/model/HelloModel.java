package com.tejas.my.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.tejas.my.service.IMyService;
import com.tejas.my.vo.HelloVo;

@Component
@Scope("session")

public class HelloModel {
	
	@Autowired
	IMyService iMyService;

	HelloVo helloVo = new HelloVo();
	
	List<String> list;

	public HelloVo getHelloVo() {
		return helloVo;
	}

	public void setHelloVo(HelloVo helloVo) {
		this.helloVo = helloVo;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public List<String> getMyName(){
		
		List<String> list = this.iMyService.getMyName();
		  return  list ;
		
	}
	
	
}
