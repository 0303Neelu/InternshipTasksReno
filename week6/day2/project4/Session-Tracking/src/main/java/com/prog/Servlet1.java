package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		
		Cookie ck = new Cookie("nm",name);
		resp.addCookie(ck);
		
		resp.setContentType("text/html");
		
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Welcome to servlet1 :</h1>"+name);
		
		out.println("<a href='servlet2'>Servlet2</a>");
		
	}

}
