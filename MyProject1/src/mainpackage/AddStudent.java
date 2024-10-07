package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;


import javax.swing.ButtonGroup;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;


public class AddStudent {

	private JFrame frmAddstudentpage;
	private JTextField txtfirstname;
	private JTextField txtlastname;
	private JTextField txtmobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frmAddstudentpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddstudentpage = new JFrame();
		frmAddstudentpage.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmAddstudentpage.setIconImage(Toolkit.getDefaultToolkit().getImage(AddStudent.class.getResource("/Images/logo.jpg")));
		frmAddstudentpage.setTitle("AddStudentPage");
		frmAddstudentpage.setBounds(200, 100, 979, 750);
		frmAddstudentpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddstudentpage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Entry Form");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(212, 24, 551, 47);
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 35));
		frmAddstudentpage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(22, 92, 893, 0);
		frmAddstudentpage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(75, 120, 130, 47);
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setBounds(75, 165, 130, 47);
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile");
		lblNewLabel_1_1_1.setBounds(75, 222, 115, 47);
		lblNewLabel_1_1_1.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Address");
		lblNewLabel_1_1_2.setBounds(75, 290, 130, 47);
		lblNewLabel_1_1_2.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Gender");
		lblNewLabel_1_1_3.setBounds(75, 459, 84, 47);
		lblNewLabel_1_1_3.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("DOB");
		lblNewLabel_1_1_4.setBounds(75, 549, 68, 47);
		lblNewLabel_1_1_4.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Degree");
		lblNewLabel_1_1_5.setBounds(535, 459, 130, 47);
		lblNewLabel_1_1_5.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Subject");
		lblNewLabel_1_1_6.setBounds(468, 549, 93, 47);
		lblNewLabel_1_1_6.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(lblNewLabel_1_1_6);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 606, 857, 0);
		frmAddstudentpage.getContentPane().add(separator_1);
		
		JTextArea txtaddress = new JTextArea();
		txtaddress.setForeground(Color.BLACK);
		txtaddress.setBackground(Color.WHITE);
		txtaddress.setFont(new Font("Georgia", Font.BOLD, 13));
		txtaddress.setBounds(212, 290, 598, 134);
		frmAddstudentpage.getContentPane().add(txtaddress);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA");
		chckbxNewCheckBox.setBounds(567, 557, 83, 33);
		chckbxNewCheckBox.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxPython = new JCheckBox("Python");
		chckbxPython.setBounds(718, 557, 99, 33);
		chckbxPython.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(chckbxPython);
		System.out.println(chckbxPython);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(212, 558, 185, 19);
		frmAddstudentpage.getContentPane().add(dateChooser);

		JPanel panel = new JPanel();
		panel.setBounds(204, 459, 238, 47);
		frmAddstudentpage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(617, 467, 185, 30);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "MCA", "ME"}));
		comboBox.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(comboBox);
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddstudentpage.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(60, 638, 130, 39);
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(btnNewButton);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Georgia", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(20, 6, 110, 35);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Georgia", Font.BOLD, 20));
		rdbtnFemale.setBounds(132, 6, 110, 35);
		panel.add(rdbtnFemale);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(267, 638, 130, 39);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String firstName=txtfirstname.getText();
				String lastName=txtlastname.getText();
				
				long mobile =Long.parseLong(txtmobile.getText());
				
				String address =txtaddress.getText();
				
				
				System.out.println(firstName+"    "+ lastName+"   "+mobile+"   "+address);				
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String date=  sdf.format(dateChooser.getDate());
				
				System.out.println(date);
				
				String subject1= null;
				String subject2=null;
				
				boolean isSelected = chckbxNewCheckBox.isSelected();
				
				if(isSelected) {
					subject1=chckbxNewCheckBox.getLabel();
					
				}

				if(isSelected) {
					subject1=chckbxPython.getLabel();
				
				
				System.out.println(subject1+subject2);
				
				String gender = null;
				
				if(rdbtnNewRadioButton.isSelected()) {
					
					gender="male";
					
				}else if(rdbtnFemale.isSelected()) {
					gender="female";
					
				}System.out.println(gender);
				
				
				String degree=null;
				
				degree=(String)comboBox.getSelectedItem();
				
				System.out.println(degree);
				
				JDBCHandling db= new JDBCHandling();
				
				int status =db.insertData(firstName, lastName, mobile, address, gender, degree, date, subject1, subject2);
				
					
					
		
				if(status==1) {
					
					JOptionPane.showMessageDialog(null, "Data Updated");
					
				}else {
					JOptionPane.showMessageDialog(null, "Problem in Add data");
				}
				
	
				
				
				
				
				
			}
			}});
		btnSave.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(495, 638, 130, 39);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfirstname.setText("");
				txtlastname.setText("");
				txtmobile.setText("");
				txtaddress.setText("");
				chckbxNewCheckBox.setSelected(false);
				chckbxPython.setSelected(false);
						dateChooser.setCalendar(null);
				
				
			}
		});
		btnReset.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(btnReset);
		
		
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(761, 638, 130, 39);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddstudentpage.setVisible(false);
			}
		});
		btnClose.setFont(new Font("Georgia", Font.BOLD, 20));
		frmAddstudentpage.getContentPane().add(btnClose);
		
		txtfirstname = new JTextField();
		txtfirstname.setBounds(212, 120, 586, 41);
		txtfirstname.setFont(new Font("Georgia", Font.BOLD, 10));
		frmAddstudentpage.getContentPane().add(txtfirstname);
		txtfirstname.setColumns(10);
		
		txtlastname = new JTextField();
		txtlastname.setFont(new Font("Georgia", Font.BOLD, 10));
		txtlastname.setBounds(212, 171, 586, 41);
		txtlastname.setColumns(10);
		frmAddstudentpage.getContentPane().add(txtlastname);
		
		txtmobile = new JTextField();
		txtmobile.setFont(new Font("Georgia", Font.BOLD, 10));
		txtmobile.setBounds(212, 222, 586, 41);
		txtmobile.setColumns(10);
		frmAddstudentpage.getContentPane().add(txtmobile);
		
		
		
		
		
		
		
		
		
	}
}

