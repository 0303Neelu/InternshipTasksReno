package reno;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class UpdateQuery {
	public static void main(String[] args) {
		try {
			
			Connection con = ConnectionProvider.getConnection();
			
			String query="update details set name=? where id=?";
			
			PreparedStatement stmt=con.prepareStatement(query);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter the name:");
			String name=br.readLine();
			
			System.out.print("Enter the id:");
			int id=Integer.parseInt(br.readLine());
			
			stmt.setString(1, name);
			stmt.setInt(2, id);
			
			stmt.executeUpdate();
			
			System.out.println("updated successfully!!");
			
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
