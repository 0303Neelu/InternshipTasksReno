package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login" , name="LoginServlet")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("login servelt works");
		PrintWriter out = resp.getWriter();
		out.println("<h1>/login form servlet/</h1>");
		
		String name="testing";
		out.println(name);
		
	}

}
