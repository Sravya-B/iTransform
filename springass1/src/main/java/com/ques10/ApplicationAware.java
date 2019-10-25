package com.ques10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationAware implements ApplicationContextAware {
	ApplicationContext context;
	public ApplicationContext getContext() {
		return context;
		
	}
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}

}
