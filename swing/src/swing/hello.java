package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hello {

	
	  private JFrame frame;
	  private JTextField textField; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					hello window = new hello();
					window.frame.setVisible(true);
	
	}

	/**
	 * Create the application.
	 */
	public hello() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 706, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(145, 65, 96, 19);
		frame.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("hello world");
			}
		});
		btnNewButton.setBounds(145, 154, 85, 21);
		frame.add(btnNewButton);
	}
}
