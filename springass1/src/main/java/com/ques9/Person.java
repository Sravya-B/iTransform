package com.ques9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean {
	private String name;
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean method is invoked");
		
	}
	public void destroy() throws Exception {
		System.out.println("DisposableBean method is invoked");
		
	}

	

}
