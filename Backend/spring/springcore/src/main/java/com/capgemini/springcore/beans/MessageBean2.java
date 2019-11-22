package com.capgemini.springcore.beans;

//2 way of life cycle using init and destroy method
public class MessageBean2 {
	private String message;
	
	public MessageBean2() {
		System.out.println("Inside constructor");
	}
	//Generate getter and setter
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("Its init phase...");
	}
	
	public void destroy() {
		System.out.println("Its destroy phase...");
	}
}

