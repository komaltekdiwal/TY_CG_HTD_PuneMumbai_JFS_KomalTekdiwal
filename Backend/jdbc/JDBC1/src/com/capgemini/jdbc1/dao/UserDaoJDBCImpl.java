package com.capgemini.jdbc1.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.jdbc1.beans.UserBean;

public class UserDaoJDBCImpl implements UserDAO
{
	
		FileReader reader = null;
		Properties prop = null;
		UserBean user=null;
		public UserDaoJDBCImpl() 
		{
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				reader=new FileReader("db.properties");
				prop = new Properties();
				prop.load(reader);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Override
		public UserBean getInfo(int userid)
		{
			//Load the driver
			try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
					PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3")))
			{		
				pstmt.setInt(1, userid);
				try (ResultSet rs = pstmt.executeQuery())
				{
					if(rs.next())
					{
						user = new UserBean();
						user.setUserid(rs.getInt(1));
						user.setName(rs.getString(2));
						user.setEmail(rs.getString(3));
					}
					return user;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return null;
		}
}
