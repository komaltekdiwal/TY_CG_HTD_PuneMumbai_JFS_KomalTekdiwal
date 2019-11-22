package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigParamServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			
			ServletConfig config = getServletConfig();  //ServleyConfig is interface we cant create obj so we can access with getServletConfig
			String empNameVal = config.getInitParameter("empName");
			
			ServletContext context = getServletContext();
			String companyNameVal = context.getInitParameter("companyName");
			
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2> Config Param Value is -" + empNameVal + "</h2>");
			out.println("<h2>Context Param Value is = " + companyNameVal + "</h2>");
			out.println("</body>");
			out.println("</html>");
			
	}//End of doGet()
}//End of class
