package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class MultServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int fn = Integer.parseInt(req.getParameter("no1"));
		int sn = Integer.parseInt(req.getParameter("no2"));
		
		int mult=fn*sn;
		
		int sum = (int)req.getAttribute("s");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h1>Sum:</h1>"+sum);
		out.println("<h1>Product:</h1>"+mult);
		
		
	}

}
