package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableForm extends JFrame {

	private JPanel contentPane;
	private JTextField nameTxt;
	private JTextField addressTxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableForm frame = new TableForm();
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
	public TableForm() {
		setTitle("TableForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Input Panel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 997, 224);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(44, 49, 49, 14);
		panel.add(lblNewLabel);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(103, 38, 178, 37);
		panel.add(nameTxt);
		nameTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(322, 49, 65, 14);
		panel.add(lblNewLabel_1);
		
		addressTxt = new JTextField();
		addressTxt.setBounds(397, 38, 145, 37);
		panel.add(addressTxt);
		addressTxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("City");
		lblNewLabel_2.setBounds(598, 49, 49, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox cityCmb = new JComboBox();
		cityCmb.setModel(new DefaultComboBoxModel(new String[] {"------- select -------------", "Kathmandu", "Pokahara", "Syangja", "Bharatpur","Nepalgunj", "Dhangadhi", "Dipayal", "Dharan"}));
		cityCmb.setBounds(657, 41, 235, 34);
		panel.add(cityCmb);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(44, 151, 49, 14);
		panel.add(lblNewLabel_3);
		
		JRadioButton maleBtn = new JRadioButton("Male");
		buttonGroup.add(maleBtn);
		maleBtn.setBounds(116, 147, 81, 23);
		panel.add(maleBtn);
		
		JRadioButton femaleBtn = new JRadioButton("Female");
		buttonGroup.add(femaleBtn);
		femaleBtn.setBounds(226, 147, 72, 23);
		panel.add(femaleBtn);
		
		JCheckBox agreeBtn = new JCheckBox("Agree");
		agreeBtn.setBounds(426, 147, 99, 23);
		panel.add(agreeBtn);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// input data validation
				
				if(nameTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(nameTxt, "name is required");
					return;
				}
				
				if(cityCmb.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(cityCmb, "city is required");
					return;
				}
				
				if(!maleBtn.isSelected() && !femaleBtn.isSelected()) {
					JOptionPane.showMessageDialog(maleBtn, "gender is required");
					return;
				}
				
				
				
				String name = nameTxt.getText();
				String adr = addressTxt.getText();
				String city = cityCmb.getSelectedItem().toString();
				
				String gender;
				
				if (maleBtn.isSelected()) {
					gender = "Male";
					
				}
				
				else {
					gender = "Female";
				}
				
				String agr;
				
				if(agreeBtn.isSelected()) {
					agr = "Yes";
				}
				
				else {
					agr = "No";
				}
				
				
				// Show data in table
				
				DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
				
				tmodel.addRow(new Object[] {name,adr,city,gender,agr});
				
				
				//clear input panel
				
				nameTxt.setText("");
				addressTxt.setText("");
				cityCmb.setSelectedIndex(0);
				buttonGroup.clearSelection();
				agreeBtn.setSelected(false);
				
				
			}
		});
		btnNewButton.setBounds(706, 133, 117, 37);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 263, 957, 271);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int srow = table.getSelectedRow();
				
				
				String nm = table.getModel().getValueAt(srow, 0).toString();
				String adr = table.getModel().getValueAt(srow, 1).toString();
				String city = table.getModel().getValueAt(srow, 2).toString();
				String gender = table.getModel().getValueAt(srow, 3).toString();
				String agr = table.getModel().getValueAt(srow, 4).toString();
				
				nameTxt.setText(nm);
				addressTxt.setText(adr);
				cityCmb.setSelectedItem(city);
				
				if(gender.equalsIgnoreCase("male")) {
					maleBtn.setSelected(true);
				}
				else {
					femaleBtn.setSelected(true);
				}
				
				if(agr.equalsIgnoreCase("yes")) {
					agreeBtn.setSelected(true);
				}
				else {
					agreeBtn.setSelected(false);
				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "City", "Gender", "Agree"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Reset Table");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
				tmodel.setRowCount(0);
			}
		});
		btnNewButton_1.setBounds(810, 546, 117, 29);
		contentPane.add(btnNewButton_1);
	}
}