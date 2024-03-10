package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd;
		
		if("sneelulatha2005@gmail.com".equals(email) && "Neelu@0303".equals(password)) {
			//redirects to home page
			
			
			/*rd=req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);*/
			
			resp.sendRedirect("servlet2");
		}
		else {
			//redirects to login page
			out.println("<h4>Invalid username or password!!</h4>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
		
	}

}
