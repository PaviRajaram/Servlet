package com.greet.web;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Watch extends HttpServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		res.setContentType("text/html");
        int hr=Integer.parseInt(req.getParameter("h")); 
        int min=Integer.parseInt(req.getParameter("m")); 
        int sec=Integer.parseInt(req.getParameter("s")); 
        res.getWriter().print("Recorded time : "+hr+"Hr :"+min+" Min :"+sec+" sec");
}
}
