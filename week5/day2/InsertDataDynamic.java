package reno;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDataDynamic {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/summa";
			String user="root";
			String password="Neelu@0303";
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			String query="insert into details(id,name) values(?,?);";
			
			PreparedStatement stmt=con.prepareStatement(query);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the name:");
			String n=br.readLine();
			System.out.print("Enter the id:");
			int a=new Scanner(System.in).nextInt();
			
			stmt.setInt(1, a);
			stmt.setString(2, n);
			
			stmt.executeUpdate();
			
			System.out.println("values inserted");
			
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
