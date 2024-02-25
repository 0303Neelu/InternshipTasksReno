package reno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/summa";
			String user="root";
			String password="Neelu@0303";
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			String query="insert into details(id,name,date) values(?,?,?);";
			
			PreparedStatement stmt=con.prepareStatement(query);
			
			stmt.setInt(1, 100);
			stmt.setString(2, "Neelakandan");
			stmt.setDate(3, java.sql.Date.valueOf("2024-02-24"));
			
			stmt.executeUpdate();
			
			System.out.println("values inserted");
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
