package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1> Employee Id" + empIdVal + " Found -</h1>");
		out.print("<h3>Employee Name =Komal");
		out.print("Salary = 1200000<br>");
		out.print("Address = Chandabai plot");
		out.println("designation = PU</h3>");
		out.print("</body>");
		out.print("</html>");
	}//End of doGet()
}//End of class
