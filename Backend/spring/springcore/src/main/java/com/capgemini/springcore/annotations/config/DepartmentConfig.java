package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;

import com.capgemini.springcore.annotations.beans.DepartmentBean;

public class DepartmentConfig {
	@Bean(name="dev")
	public DepartmentBean getDevDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(234);
		bean.setDeptName("Dev");
		return bean;
	}
	
	@Bean(name="testing")
	//@Primary
	public DepartmentBean getTestDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(235);
		bean.setDeptName("Testing");
		return bean;
	}
	
	
	@Bean(name="HR")
	public DepartmentBean getHrDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(193);
		bean.setDeptName("HR");
		return bean;
	}
}
