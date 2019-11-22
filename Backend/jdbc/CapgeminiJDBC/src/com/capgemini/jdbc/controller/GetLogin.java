package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class GetLogin 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("Enter the id..");
		int userid=Integer.parseInt(scan.next());
		System.out.println("Enter thepassword..");
		String password = scan.next();
		
		UserBean user = dao.userLogin(userid, password);
		if(user!=null)
		{
			System.out.println(user);
		}
		else
		{
			System.out.println("Something went wrong...");
		}
		
		
		
		
	}
}
	