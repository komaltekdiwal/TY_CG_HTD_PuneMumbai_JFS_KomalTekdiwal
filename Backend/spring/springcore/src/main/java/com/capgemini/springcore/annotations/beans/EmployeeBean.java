package com.capgemini.springcore.annotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
	private int empId;
	private String emopNme;
	@Autowired(required=false)
	@Qualifier("dev")            //Qualifier comes with @Autowired
	private DepartmentBean deptBean;
	
	//Getters and Setters
	public DepartmentBean getDeptBean() {
		return deptBean;
	}
	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmopNme() {
		return emopNme;
	}
	public void setEmopNme(String emopNme) {
		this.emopNme = emopNme;
	}
	
	
	// bean life cycle 
	@PostConstruct
	public void init() {
		System.out.println("Its Init Phase...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Phase !");
	}//End of destroy
	
}//End of class
