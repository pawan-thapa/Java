package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestForm {
public static void main(String[] args) {
	
	JFrame form = new JFrame();
	form.setSize(1800,1900);
	form.setTitle("Test Form");
	form.setLayout(null);
	
	// create Jlabel
	
	JLabel jl = new JLabel("Welcome");
	jl.setBounds(700,20,120,20);    // setBounds(x-coordinate, y-coordinate,width,height)
	form.add(jl);
	
	JLabel jlu = new JLabel("Username: ");
	jlu.setBounds(500,70,120,20);
	form.add(jlu);
	
	JTextField jlt = new JTextField();
	jlt.setBounds(600,70,320,20);
	form.add(jlt);
	
	JLabel jlp = new JLabel("Password: ");
	jlp.setBounds(500,100,120,20);
	form.add(jlp);
	
	JPasswordField jt = new JPasswordField();
	jt.setBounds(600,100,320,20);
	form.add(jt);
	
	JButton jb = new JButton("Login");
	jb.setBounds(700,150,120,20);
	form.add(jb);
	
	form.setVisible(true);
}
}
