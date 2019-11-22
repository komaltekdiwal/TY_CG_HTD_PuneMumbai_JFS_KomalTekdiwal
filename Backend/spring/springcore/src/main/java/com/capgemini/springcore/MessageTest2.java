package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean2;

public class MessageTest2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//	((AbstractApplicationContext)context).registerShutdownHook();  //one way of destroying object
		MessageBean2 messageBean2 =  context.getBean("messageBean2",MessageBean2.class);
		System.out.println(messageBean2.getMessage());

		MessageBean2 bean2 =  context.getBean("messageBean2",MessageBean2.class);
		System.out.println(bean2.getMessage()); 
		
		((AbstractApplicationContext)context).close();   //another way to destroy object

	}//End of main()
}//End of class
