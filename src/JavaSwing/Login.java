package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JPasswordField Pswrd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel UserNameText = new JLabel("Username");
		UserNameText.setBounds(127, 73, 87, 24);
		contentPane.add(UserNameText);
		
		Name = new JTextField();
		Name.setBounds(213, 72, 146, 26);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JLabel PasswordText = new JLabel("Password");
		PasswordText.setBounds(127, 135, 61, 16);
		contentPane.add(PasswordText);
		
		Pswrd = new JPasswordField();
		Pswrd.setBounds(213, 130, 146, 26);
		contentPane.add(Pswrd);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String U = Name.getText();
				String P = Pswrd.getText();
				
				 try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
						
						//login sql 
						
						String sql = "select * from user where username ='"+U+"' and password = '"+P+"'";
						
						Statement stm = con.createStatement();
						
						ResultSet rs = stm.executeQuery(sql);
						
					
				
				if(rs.next()) {
					
					JOptionPane.showMessageDialog(null, "Login success");
					new Welcome().setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Login failed");
				}
				 } catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnNewButton.setBounds(170, 200, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new IndexPage().setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_1.setBounds(16, 6, 117, 29);
		contentPane.add(btnNewButton_1);
	}
}
