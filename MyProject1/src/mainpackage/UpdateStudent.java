package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

//
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class UpdateStudent {

	private JFrame frmUpdateStuddent;
	private JTextField txtfirstname;
	private JTextField txtlastname;
	private JTextField txtmobilenumber;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtSerialNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent window = new UpdateStudent();
					window.frmUpdateStuddent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateStuddent = new JFrame();
		frmUpdateStuddent.setTitle("Update Studdent");
		frmUpdateStuddent.setIconImage(Toolkit.getDefaultToolkit().getImage(UpdateStudent.class.getResource("/Images/logo.jpg")));
		frmUpdateStuddent.setBounds(250, 100, 1050, 800);
		frmUpdateStuddent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateStuddent.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Serial number To Update");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 35));
		lblNewLabel.setBounds(29, 10, 692, 94);
		frmUpdateStuddent.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 91, 1016, 13);
		frmUpdateStuddent.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number =Integer.parseInt(txtSerialNumber.getText());
			
			JDBCHandling db= new JDBCHandling();
			
	          ResultSet result=null;
			
			result=db.getRow(number);
			try {
				while(result.next()){
					txtfirstname.setText(result.getString(2));
					txtlastname.setText(result.getString(3));
					
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			try {
				result.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
		});
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 20));
		btnNewButton.setBounds(894, 37, 121, 38);
		frmUpdateStuddent.getContentPane().add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 675, 1016, 2);
		frmUpdateStuddent.getContentPane().add(separator_1);
		txtfirstname = new JTextField();
		txtfirstname.setBounds(222, 131, 745, 28);
		frmUpdateStuddent.getContentPane().add(txtfirstname);
		txtfirstname.setColumns(10);
		
		txtlastname = new JTextField();
		txtlastname.setColumns(10);
		txtlastname.setBounds(222, 208, 745, 28);
		frmUpdateStuddent.getContentPane().add(txtlastname);
		
		txtmobilenumber = new JTextField();
		txtmobilenumber.setColumns(10);
		txtmobilenumber.setBounds(222, 277, 745, 28);
		frmUpdateStuddent.getContentPane().add(txtmobilenumber);
		
		JTextArea txtaddress = new JTextArea();
		txtaddress.setBounds(229, 344, 738, 94);
		frmUpdateStuddent.getContentPane().add(txtaddress);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Georgia", Font.BOLD, 15));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(224, 478, 149, 28);
		frmUpdateStuddent.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Georgia", Font.BOLD, 15));
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(375, 478, 154, 28);
		frmUpdateStuddent.getContentPane().add(rdbtnNewRadioButton_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(218, 573, 265, 36);
		frmUpdateStuddent.getContentPane().add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Georgia", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "MCA", "ME"}));
		comboBox.setBounds(747, 498, 221, 38);
		frmUpdateStuddent.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA");
		chckbxNewCheckBox.setFont(new Font("Georgia", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(710, 571, 149, 38);
		frmUpdateStuddent.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PYTHON");
		chckbxNewCheckBox_1.setFont(new Font("Georgia", Font.BOLD, 15));
		chckbxNewCheckBox_1.setBounds(867, 573, 142, 38);
		frmUpdateStuddent.getContentPane().add(chckbxNewCheckBox_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdateStuddent.setVisible(false);
				
			}
		});
		btnBack.setFont(new Font("Georgia", Font.BOLD, 20));
		btnBack.setBounds(29, 702, 121, 38);
		frmUpdateStuddent.getContentPane().add(btnBack);
		
		JButton btnNewButton_1_1 = new JButton("Save");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String firstName=txtfirstname.getText();
				String lastName=txtlastname.getText();
				
				long mobile =Long.parseLong(txtmobilenumber.getText());
				
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
					subject1=chckbxNewCheckBox_1.getLabel();
				}
				
				System.out.println(subject1+subject2);
				
				String gender = null;
				
				if(rdbtnNewRadioButton.isSelected()) {
					
					gender="male";
					
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					gender="female";
					
				}System.out.println(gender);
				
				
				String degree=null;
				
				degree=(String)comboBox.getSelectedItem();
				
				System.out.println(degree);
				
				JDBCHandling db= new JDBCHandling();
				
				int status =db.insertUpdate(firstName, lastName, mobile, address, gender, degree, date, subject1, subject2);
				
					
					
		
				if(status==1) {
					
					JOptionPane.showMessageDialog(null, "Data Updated");
					
				}else {
					JOptionPane.showMessageDialog(null, "Problem in Update data");
				}
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Georgia", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(282, 702, 121, 38);
		frmUpdateStuddent.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Reset");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfirstname.setText("");
				txtlastname.setText("");
				txtmobilenumber.setText("");
				txtaddress.setText("");
				chckbxNewCheckBox_1.setSelected(false);
				dateChooser.setCalendar(null);
				
				
				
				
				
				//chckbxNewCheckBox.setSelected(false);
				
				
			}
				
			}
		);
		btnNewButton_1_1_1.setFont(new Font("Georgia", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(572, 702, 121, 38);
		frmUpdateStuddent.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Close");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnNewButton_1_1_2.setFont(new Font("Georgia", Font.BOLD, 20));
		btnNewButton_1_1_2.setBounds(870, 702, 121, 38);
		frmUpdateStuddent.getContentPane().add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1.setBounds(39, 122, 165, 38);
		frmUpdateStuddent.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(39, 199, 165, 38);
		frmUpdateStuddent.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Moblie Number");
		lblNewLabel_1_2.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(39, 276, 165, 38);
		frmUpdateStuddent.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Address");
		lblNewLabel_1_2_1.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(39, 344, 165, 38);
		frmUpdateStuddent.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Gender");
		lblNewLabel_1_2_2.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_2_2.setBounds(39, 466, 165, 38);
		frmUpdateStuddent.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("D O B");
		lblNewLabel_1_2_3.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_2_3.setBounds(39, 571, 165, 38);
		frmUpdateStuddent.getContentPane().add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Degree");
		lblNewLabel_1_2_4.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_2_4.setBounds(572, 466, 165, 38);
		frmUpdateStuddent.getContentPane().add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Subject");
		lblNewLabel_1_2_5.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_2_5.setBounds(572, 571, 165, 38);
		frmUpdateStuddent.getContentPane().add(lblNewLabel_1_2_5);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setFont(new Font("Georgia", Font.BOLD, 18));
		txtSerialNumber.setBounds(747, 36, 107, 28);
		frmUpdateStuddent.getContentPane().add(txtSerialNumber);
		txtSerialNumber.setColumns(10);
		
	
	}
}
