package com.capgemini.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml"); //Instantiate the container
		EmployeeBean emp1 = context.getBean("employee",EmployeeBean.class);

		System.out.println("Enter Employee ID : ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Empployee Name : ");
		String empName=sc.nextLine();

		emp1.setEmpId(empId);
		emp1.setEmpName(empName);

		EmployeeBean emp2 = context.getBean("employee",EmployeeBean.class);

		System.out.println("Enter Employee 2 ID : ");
		int empId2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Empployee 2 Name : ");
		String empName2=sc.nextLine();

		emp2.setEmpId(empId2);
		emp2.setEmpName(empName2);
		
		System.out.println("Emp 1 ID = " +  emp1.getEmpId());
		System.out.println("Emp 1 ID = " +  emp1.getEmpName());
		System.out.println("Emp 2 ID = " + emp2.getEmpId());
		System.out.println("Emp 2 ID =7 " + emp2.getEmpName());
	}
}
