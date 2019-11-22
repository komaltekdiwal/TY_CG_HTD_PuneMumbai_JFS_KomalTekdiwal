package com.capgemini.jdbc1.factory;

import com.capgemini.jdbc1.dao.UserDAO;
import com.capgemini.jdbc1.dao.UserDaoJDBCImpl;

public class UserFactory
{
	private UserFactory()
	{
		
	}
	
	public static UserDAO getInstance()
	{
		UserDAO dao = new UserDaoJDBCImpl();
		return dao;
	}
}
