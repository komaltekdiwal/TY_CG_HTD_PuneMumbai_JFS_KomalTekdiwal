<%@page import="com.capgemini.springmvc.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%
	HttpSession session = request.getSession(false);
	EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>
		Welcome
		<%=employeeInfoBean.getEmpName()%>!
	</h3>
	<a href="./addEmployeeForm">Add Employee</a>
	<a href="./updateEmployeeForm">Update Employee</a>
	<a href="./deleteEmployeeForm">Delete Employee</a>
	<a href="./searchEmployeeForm">Search Employee</a>
	<a href="./seeAllEmployees">All Employees</a>
	<a href="./logout">Logout</a>
</body>
</html>