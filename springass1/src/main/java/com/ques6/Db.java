package com.ques6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Db {
	@Value("${jdbc.driverClassName}")
	 String className;
	@Value("${jdbc.dbUrl}")
	 String url;
	@Value("${jdbc.userName}")
	 String uName;
	@Value("${jdbc.password}")
	 String password;
	@Override
	public String toString() {
		return "Db [className=" + className + ", url=" + url + ", uName=" + uName + ", password=" + password + "]";
	}

	
}
