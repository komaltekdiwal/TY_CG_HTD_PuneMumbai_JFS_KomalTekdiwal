package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//1 way of lifecycle using InitializingBean , DisposableBean
public class MessageBean implements InitializingBean , DisposableBean{

	private String message;

	//Generate getter and setter
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Initializing Phase...!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Destroy Phase...!!");
	}
	}

	
//End of class
