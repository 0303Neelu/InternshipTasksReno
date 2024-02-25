package reno;

import java.awt.Image;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Helper {
	public static ImageIcon getImageIcon(int id,Connection con) {
		ImageIcon icon=null;
		
		try {
			
			String query="select pic from store where id=?;";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1,id);
			
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()) {
				
				Blob b = rs.getBlob(1);
				
				InputStream is = b.getBinaryStream();
				
				Image image=ImageIO.read(is);
				
				icon=new ImageIcon(image);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return icon;
	}
}
