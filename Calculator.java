package com.greet.web;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Calculator extends HttpServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		res.setContentType("text/html");
		int x=Integer.parseInt(req.getParameter("n1"));
		int y=Integer.parseInt(req.getParameter("n2"));
		res.getWriter().print("Sum of Number1 and Number2 : "+(x+y));
}
}
