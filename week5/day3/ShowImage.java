package reno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.text.NumberFormat.Field;
import java.awt.event.ActionEvent;

public class ShowImage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					ShowImage frame = new ShowImage();
					frame.setLocationRelativeTo(null);				
					frame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShowImage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1330, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		imageLabel.setBounds(43, 140, 1212, 525);
		contentPane.add(imageLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s= field.getText().trim();
				
				int id=Integer.parseInt(s);
				
				ImageIcon icon = Helper.getImageIcon(id, ConnectionProvider.getConnection());
				
				if(icon==null) {
					JOptionPane.showMessageDialog(null, "no image is found for your id");
				}
				else {
					imageLabel.setIcon(icon);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(783, 44, 161, 56);
		contentPane.add(btnNewButton);
		
		field = new JTextField();
		field.setFont(new Font("Tahoma", Font.PLAIN, 18));
		field.setBounds(431, 44, 195, 56);
		contentPane.add(field);
		field.setColumns(10);
	}
}
