package com.capgemini.jdbc1.controller;

import java.util.Scanner;

import com.capgemini.jdbc1.beans.UserBean;
import com.capgemini.jdbc1.dao.UserDAO;
import com.capgemini.jdbc1.factory.UserFactory;

public class GetInfo 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("Enter the user id...");
		UserBean user = dao.getInfo(scan.nextInt());
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
