package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlets extends HttpServlet {
	
	public DateServlets() {
		System.out.println("Its instantiation phase" );
	}
	
	@Override
	public void init() throws ServletException {
	System.out.println("Its initialization phase");	
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Its service phase");
		Date date = new Date();
		
		ServletContext context = getServletContext();
		String companyNameVal = context.getInitParameter("companyName");
		
		resp.setHeader("refresh", "1");
		resp.setContentType("text/html");  //what type of content we r going to get

		PrintWriter out = resp.getWriter();
		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta http-equiv='refresh' content='1'>");//auto-reload page after every 1 second
//		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Current System Date & Time-<br>");
		out.println(date + "</h1>");
		out.println("<h2>Context Param value is "  + companyNameVal + "</h2>");
		out.println("</body>");
		out.println("</html>");
		
		


	}//End of doGet()
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Its destroy phase");
	}
	
}//End of class
