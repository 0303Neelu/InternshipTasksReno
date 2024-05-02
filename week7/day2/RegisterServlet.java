package com.servlets;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class RegisterServlet
 */
@MultipartConfig
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String name=request.getParameter("username");
		String password=request.getParameter("userpassword");
		String email=request.getParameter("useremail");
		Part part = request.getPart("image");	
		String filename=part.getSubmittedFileName();
		
		
		try {
			Thread.sleep(3000);
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Neelu@0303");
			
			String q="insert into user(name,email,password,imageName) values(?,?,?,?);";
			
			PreparedStatement pstmt=con.prepareStatement(q);
			
			pstmt.setString(1,name);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4,filename);
			
			//pstmt.executeUpdate();
			
			InputStream is=part.getInputStream();
			byte []data=new byte[is.available()];
			
			
			is.read(data);
			String path=request.getRealPath("/")+"img"+File.separator+filename;
			
			FileOutputStream fos=new FileOutputStream(path);
			
			fos.write(data);
			fos.close();
			
			out.println("done");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			out.println("<h1>error occured</h1>");
		}
		
	}

}
