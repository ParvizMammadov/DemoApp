package com.parviz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		out.println("Hello, " + name);
		
		ServletConfig cg = getServletConfig();
		String password = cg.getInitParameter("password");
		out.println("Your password is " + password);
	}
}
