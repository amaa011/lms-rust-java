package com.telebilling.service; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;


public class signin extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	public signin() {
		getContentPane().setBackground(new Color(178, 34, 34));
		getContentPane().setForeground(new Color(255, 0, 0));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 240, 723);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ahmed\\Dropbox\\PC\\Downloads\\knowledge.png"));
		lblNewLabel_6.setBounds(32, 197, 146, 149);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Welcome to the Liberiry system\r\n");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(10, 356, 301, 47);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(353, 124, 424, 469);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(140, 45, 185, 59);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(85, 151, 104, 51);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(85, 201, 215, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pasword");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(90, 265, 81, 13);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 293, 215, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("login\r\n");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBounds(94, 372, 192, 33);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(140, 100, 81, 10);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ahmed\\Dropbox\\PC\\Downloads\\user (5).png"));
		lblNewLabel_3.setBounds(40, 189, 45, 33);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ahmed\\Dropbox\\PC\\Downloads\\padlock (1).png"));
		lblNewLabel_4.setBounds(40, 293, 45, 33);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ahmed\\Dropbox\\PC\\Downloads\\book (1).png"));
		lblNewLabel_5.setBounds(55, 45, 64, 65);
		panel_1.add(lblNewLabel_5);
		ImageIcon img1= new ImageIcon(this.getClass().getResource("/TELE-Billing/src/com/telebilling/service/images/user-286.png").getFile());
		/**
		 * 
		 */
	}

	  



		public static void main(String []args) throws UnknownHostException
		{
			new signin();		
			 
		}
		
		public void actionPerformed(ActionEvent ae) {
			// Check if the login button was clicked
	        if (ae.getActionCommand().equals("Login")) {
	            JTextComponent textFieldUsername;
				String username = textFieldUsername.getText();
	            Object passwordField;
				String password = new String(passwordField.getPassword());

	            Object lmsWebService;
				// Call the login method through the web service
	            boolean loginResult = lmsWebService.signup(username, password);

	            // Check the login result
	            if (loginResult) {
	                System.out.println("Login successful!");
	                // Redirect to the home page or execute other actions for authenticated users
	                openHomePage();
	            } else {
	                System.out.println("Login failed! Invalid credentials.");
	                // Handle the case when login fails
	                // For example, display an error message or redirect back to the login page
	            }
	        }
	    }

	    private void openHomePage() {
	        System.out.println("Redirecting to the home page...");
	        // Add your code here to open the home page
	        // For example, you can instantiate the home page class and call its methods
	    }
	}