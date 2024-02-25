package reno;

import java.sql.Connection;
import java.sql.DriverManager;

public class Example {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/summa";
		String user="root";
		String password="Neelu@0303";
		
		Connection con = DriverManager.getConnection(url,user,password);
		
		if(con.isClosed()) {
			System.out.println("connection closed");
		}
		else {
			System.out.println("connection opened");
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
