<%@page import="com.capgemini.springmvc.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% /* String empId = (String) request.getAttribute("empId"); */
/* int empId = (int) request.getAttribute("empId");
String password = (String) request.getAttribute("password"); */

UserBean userBean = (UserBean) request.getAttribute("userBean");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Entered Id = <%=empId %>
	Entered Passsword = <%=password %>  --%> 
	
	Entered Employee ID = <%=userBean.getEmpId() %><br>
	Entered Password = <%=userBean.getPassword() %><br>
	Entered DOB = <%=userBean.getDate() %><br>
</body>
</html>