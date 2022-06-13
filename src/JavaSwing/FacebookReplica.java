package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JButton;

public class FacebookReplica extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacebookReplica frame = new FacebookReplica();
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
	public FacebookReplica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 540);
		getContentPane().setLayout(null);
		
		JTextPane txtpnFacebook = new JTextPane();
		txtpnFacebook.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		txtpnFacebook.setForeground(Color.BLUE);
		txtpnFacebook.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		txtpnFacebook.setBounds(0, 0, 617, 84);
		getContentPane().add(txtpnFacebook);
		
		JLabel lblNewLabel = new JLabel("facebook");
		lblNewLabel.setForeground(UIManager.getColor("EditorPane.inactiveForeground"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel.setBounds(39, 20, 182, 36);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email or phone");
		lblNewLabel_1.setBounds(280, 16, 94, 16);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(280, 30, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(425, 16, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(420, 30, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(550, 30, 70, 29);
		getContentPane().add(btnLogin);
		
		JLabel lblNewLabel_3 = new JLabel("Forgot password?");
		lblNewLabel_3.setBounds(430, 56, 120, 16);
		getContentPane().add(lblNewLabel_3);
	}
}
