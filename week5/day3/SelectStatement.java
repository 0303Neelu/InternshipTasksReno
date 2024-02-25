package reno;
import java.sql.*;

public class SelectStatement {
	public static void main(String[] args) {
		try {
			
			Connection con = ConnectionProvider.getConnection();
			
			String query="select * from details;";
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+":");
				System.out.print(rs.getString(2)+":");
				System.out.println(rs.getString(3));
			}
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
