package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/updateEmployee")
public class UpdateEmployee extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		HttpSession session = req.getSession(false);
		if(session!=null) {

			int empId = Integer.parseInt(req.getParameter("empId"));
			String salaryVal = req.getParameter("salary");
			String mobileVal = req.getParameter("mobile");
			String ageVal = req.getParameter("mobile");
			String genderVal = req.getParameter("gender");
			String empName = req.getParameter("emoName");
			String password = req.getParameter("password");
			String designation = req.getParameter("designation");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			
			if(empName !=null && ! empName.isEmpty()) {
				employeeInfoBean.setEmpName(empName);
			}
			
			if(ageVal !=null && ! ageVal.isEmpty()) {
				employeeInfoBean.setAge(Integer.parseInt(ageVal));
			}
			
			if(salaryVal !=null && ! salaryVal.isEmpty()) {
				employeeInfoBean.setSalary(Double.parseDouble(salaryVal));
			}
			
			if(mobileVal !=null && ! mobileVal.isEmpty()) {
				employeeInfoBean.setEmpName(mobileVal);
			}
			
			if(genderVal !=null && ! genderVal.isEmpty()) {
				employeeInfoBean.setEmpName(genderVal);
			}
			
			if(designation !=null && ! designation.isEmpty()) {
				employeeInfoBean.setEmpName(designation);
			}
			
			if(password !=null && ! password.isEmpty()) {
				employeeInfoBean.setEmpName(password);
			}
			
			
			EmployeeDAO dao = new EmployeeDAOJpaImpl();
			boolean isAdded = dao.addEmployee(employeeInfoBean);

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(isAdded) {
				out.println("<h2> Employee Details Updated Successfully</h2>");

			}else {
				out.println("<h2 style='color:red'>Employee ID Not Found!!!</h2>");
			}
			out.println("</body>");
			out.println("</html>");

		
			RequestDispatcher dispatcher = req.getRequestDispatcher("./updateEmployee.html");
			dispatcher.include(req,resp);
		}else {
			//Invalid session

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style ='color:red>Please login  first </h2>");
			out.println("</body>");
			out.println("</html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req,resp);
		}
	}	
}
