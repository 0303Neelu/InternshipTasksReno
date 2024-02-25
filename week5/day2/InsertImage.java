package reno;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/summa";
			String user="root";
			String password="Neelu@0303";
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			String query="insert into store(pic) values(?);";
			
			PreparedStatement stmt=con.prepareStatement(query);
			
			FileInputStream fis= new FileInputStream("C:\\summa1.jpeg");
			
			stmt.setBinaryStream(1,fis,fis.available());
			
			stmt.executeUpdate();
			
			System.out.println("photo stored");
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
