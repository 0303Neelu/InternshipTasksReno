package reno;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InsertBigImage {
	public static void main(String[] args) {
		
		
		try {
			
			Connection con=ConnectionProvider.getConnection();
			
			String query="insert into store(pic) values(?);";
			
			
			PreparedStatement stmt=con.prepareStatement(query);
			
			JFileChooser jfc = new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file=jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(file);
			
			stmt.setBinaryStream(1,fis,fis.available());
			
			stmt.executeUpdate();
			
			//System.out.println("photo inserted successfully");
			JOptionPane.showMessageDialog(null, "success");
			
			con.close();
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
	}
}
