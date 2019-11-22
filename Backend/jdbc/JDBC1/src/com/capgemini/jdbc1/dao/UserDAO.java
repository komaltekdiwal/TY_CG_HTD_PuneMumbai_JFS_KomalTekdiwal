package com.capgemini.jdbc1.dao;

import com.capgemini.jdbc1.beans.UserBean;

public interface UserDAO
{

	//public List<UserBean> getAllInfo();
	public UserBean getInfo(int userid);
}
