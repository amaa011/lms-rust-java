package com.telebilling.service; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Client extends JFrame implements ActionListener
{
	public home_page() {
		getContentPane().setBackground(new Color(178, 34, 34));
		getContentPane().setForeground(new Color(255, 0, 0));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 240, 723);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Manage book");
		btnNewButton_2.setBounds(10, 134, 165, 60);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("return book ");
		btnNewButton_3.setBounds(10, 226, 165, 58);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("isuuse Book");
		btnNewButton_4.setBounds(10, 313, 165, 60);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("contact admin ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(10, 390, 165, 60);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("view book");
		btnNewButton_5_1.setBounds(10, 474, 165, 60);
		panel.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("logout");
		btnNewButton_5_2.setBackground(SystemColor.menu);
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_2.setBounds(10, 579, 165, 60);
		panel.add(btnNewButton_5_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(281, 10, 531, 662);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ahmed\\Dropbox\\PC\\Downloads\\book (1).png"));
		lblNewLabel_5.setBounds(55, 22, 64, 65);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Liberiry mangment system");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(129, 32, 392, 40);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 151, 217, 148);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.RED);
		panel_3.setBounds(0, 0, 217, 10);
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("10");
		lblNewLabel_3.setBounds(152, 61, 55, 49);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(294, 151, 227, 148);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 227, 10);
		panel_4.add(panel_5);
		panel_5.setBackground(Color.BLUE);
		
		JLabel lblNewLabel_4 = new JLabel("13");
		lblNewLabel_4.setBounds(184, 58, 33, 57);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("no of books available");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(24, 120, 147, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("no of book borrod ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(298, 129, 174, 13);
		panel_1.add(lblNewLabel_2);
		ImageIcon img1= new ImageIcon(this.getClass().getResource("/TELE-Billing/src/com/telebilling/service/images/user-286.png").getImage());
	}
	
	/**
	 * 
	 */
	
	
	
	
	}

	  



		public static void main(String []args) throws UnknownHostException
		{
			TELEWebServiceService service = new TELEWebServiceService();
	        com.telebilling.service.client.TELEWebService TELEWebService = service.getTELEWebServicePort(); 
	  
	        //read Input details from user
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String Type="", TypeDescription="";
	        String TransactionStatus = "";  
	        
	        System.out.println("Please select type of service");
	        System.out.println("Type: 1 for Fixed Line and 2 for Mobile");
	        int x = Integer.parseInt(br.readLine());
	        if(x ==1){ 
	        	Type="FixedLineBILL";
	        	TypeDescription = "Fixed Line";
	        }else{
	        	Type="mobileBill";
	        	TypeDescription = "Mobile Line";
	        }
	        System.out.println("Enter the preferred month ex:October");
	        String Month=br.readLine();
	        System.out.println("Enter your " + TypeDescription + " number. (ex: 24100000/90010001)");
	        String AccountNo=br.readLine();       
	        	
	        //Search for Amount for client's account no. from web service  
	        String amount = TELEWebService.payTELEBillAmount(Type, Month, AccountNo);
	        System.out.println("Web service response: " + amount);
	        
	        //Pay the amount through the web service 
	        if(Type.equals("FixedLineBILL")){
	        	 TransactionStatus = TELEWebService.payFixedLineBillProcess(AccountNo, amount);
	        }else{
	        	 TransactionStatus = TELEWebService.paymobileBillProcess(AccountNo, amount);
	        }
	        System.out.println("Web service response: " + TransactionStatus);
			 
		}
		
		public void actionPerformed(ActionEvent ae) {
		
			
		}
}