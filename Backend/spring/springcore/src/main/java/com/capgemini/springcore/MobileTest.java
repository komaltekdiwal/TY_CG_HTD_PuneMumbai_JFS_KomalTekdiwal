package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Mobile;

public class MobileTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile = context.getBean("mobile",Mobile.class);
		
		System.out.println("Mobile brand is " + mobile.getBrandName());
		System.out.println("Mobile display size is  " + mobile.getDisplaySize());
		System.out.println("Mobile resolution is " + mobile.getResolution());
		System.out.println("Mobile display size is  " + mobile.getMobileDisplay().getDisplaySize());
		System.out.println("Mobile display resoltuion is  " + mobile.getMobileDisplay().getResolution());
	}
}
