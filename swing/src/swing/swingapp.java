package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingapp {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingapp window = new swingapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public swingapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 901, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(47, 47, 67, 41);
		frame.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(144, 58, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 121, 96, 19);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(47, 121, 67, 19);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField.getText();
				if(username.equals("ram") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(null, "login successfull by "+username);
				}
				else if(username.equals("suraj") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(null, "login successfull by "+username);
				}
				else if(username.equals("abhas") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(null, "login successfull by "+username);
				}
				
				else if(username.equals("chandan") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(null, "login successfull by "+username);
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null, "invalid username or password");
				}
			}
		});
		btnNewButton.setBounds(144, 169, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnCancel.setBounds(271, 169, 85, 21);
		frame.getContentPane().add(btnCancel);
	}
}
