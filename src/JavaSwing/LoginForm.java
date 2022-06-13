package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField UserNametxt;
	private JPasswordField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 390);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(99, 53, 81, 16);
		contentPane.add(lblNewLabel);
		
		UserNametxt = new JTextField();
		UserNametxt.setBounds(192, 48, 150, 26);
		contentPane.add(UserNametxt);
		UserNametxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(99, 85, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setBounds(192, 80, 150, 26);
		contentPane.add(passwordTxt);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome");
		lblNewLabel_2.setBounds(192, 19, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				JOptionPane.showMessageDialog(null, "Hello");
				
				String un = UserNametxt.getText();
				String psw = passwordTxt.getText();
				
				if (un.equals ("ram") && psw.equals("123")) {
					
					JOptionPane.showMessageDialog(null, "Login Success");
					
					new HomePage().setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Login failed");
				}
				
				
			
				
				
			}
		});
		btnNewButton.setBounds(185, 118, 117, 29);
		contentPane.add(btnNewButton);
	}
}
