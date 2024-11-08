import javax.swing.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JButton signupButton;

    public Signup() {
        // Set up UI elements
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel emailLabel = new JLabel("Email:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emailField = new JTextField(20);
        signupButton = new JButton("Signup");

        // Add action listener to signup button
        signupButton.addActionListener(this);

        // Add UI elements to layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(signupButton);

        // Set up frame
        setTitle("Signup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        pack();
        setVisible(true);
    }

    
	/**
	 * 
	 */
	
	  



		public static void main(String []args) throws UnknownHostException
		{
					
			 
		}
		
		public void actionPerformed(ActionEvent ae) {
		
			// Handle signup button click
	        String username = usernameField.getText();
	        String password = new String(passwordField.getPassword());
	        String email = emailField.getText();

	        // Send signup data to server (you'll need to implement this)
	        sendSignupData(username, password, email);
		}
}