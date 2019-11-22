package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h2> Hello User</h2>");
	out.println("</body>");
	out.println("</html>");
//	String url="./currentDate";  //dynamic resource
	String url = "./searchEmployeeForm.html"; //static resource
	
	//including the resource
	RequestDispatcher dispatcher = req.getRequestDispatcher(url);
	dispatcher.include(req, resp);
	
	
	}//End of doGet
}//End of class
