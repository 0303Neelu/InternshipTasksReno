package reno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/summa";
			String user="root";
			String password="Neelu@0303";
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			String query="create table details(id int,name varchar(255),date date);";
			//String q="create table store (id int primary key auto_increment,pic blob);";
			
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate(query);
			
			System.out.println("Table created");
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
