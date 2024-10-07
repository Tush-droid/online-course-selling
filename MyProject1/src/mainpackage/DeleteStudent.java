package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class DeleteStudent {

	private JFrame frmDeleteStudentForm;
	private JTextField txtserialNumber;
	private JTextField txtfirstName;
	private JTextField txtlastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
					window.frmDeleteStudentForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteStudentForm = new JFrame();
		frmDeleteStudentForm.setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteStudent.class.getResource("/Images/logo.jpg")));
		frmDeleteStudentForm.setTitle("Delete Student form");
		frmDeleteStudentForm.setBounds(100, 100, 985, 689);
		frmDeleteStudentForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteStudentForm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Student Entry");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 35));
		lblNewLabel.setBounds(268, 10, 581, 85);
		frmDeleteStudentForm.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 84, 951, 2);
		frmDeleteStudentForm.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Serial Number To Update");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1.setBounds(48, 241, 361, 36);
		frmDeleteStudentForm.getContentPane().add(lblNewLabel_1);
		
		txtserialNumber = new JTextField();
		txtserialNumber.setBounds(445, 239, 151, 48);
		frmDeleteStudentForm.getContentPane().add(txtserialNumber);
		txtserialNumber.setColumns(10);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number =Integer.parseInt(txtserialNumber.getText());
				JDBCHandling db= new JDBCHandling();
				
		          ResultSet result=null;
				
				result=db.getRow(number);
				try {
					while(result.next()){
						txtfirstName.setText(result.getString(2));
						txtlastName.setText(result.getString(3));
						
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
		btnNewButton.setBounds(648, 240, 151, 48);
		frmDeleteStudentForm.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(48, 387, 179, 36);
		frmDeleteStudentForm.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(48, 445, 145, 36);
		frmDeleteStudentForm.getContentPane().add(lblNewLabel_1_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 560, 951, 2);
		frmDeleteStudentForm.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteStudentForm.setVisible(false);
				
			}
		});
		btnBack.setFont(new Font("Georgia", Font.BOLD, 20));
		btnBack.setBounds(53, 591, 140, 28);
		frmDeleteStudentForm.getContentPane().add(btnBack);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBCHandling db= new JDBCHandling();
				int serialNumber=Integer.parseInt(txtserialNumber.getText());
				int status=db.deleteUpdate(serialNumber);
				

		



				if(status==1) {

					JOptionPane.showMessageDialog(null, "Data Deleted sucessfully");

				}else {
					JOptionPane.showMessageDialog(null, "Problem in delete data");
				}
                 
				txtfirstName.setText(null);
                 txtlastName.setText(null);
                   txtserialNumber.setText(null);  
			}
		});
		btnDelete.setFont(new Font("Georgia", Font.BOLD, 20));
		btnDelete.setBounds(438, 591, 140, 28);
		frmDeleteStudentForm.getContentPane().add(btnDelete);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Georgia", Font.BOLD, 20));
		btnClose.setBounds(801, 591, 140, 28);
		frmDeleteStudentForm.getContentPane().add(btnClose);
		
		txtfirstName = new JTextField();
		txtfirstName.setFont(new Font("Georgia", Font.BOLD, 20));
		txtfirstName.setColumns(10);
		txtfirstName.setBounds(244, 387, 435, 36);
		frmDeleteStudentForm.getContentPane().add(txtfirstName);
		
		txtlastName = new JTextField();
		txtlastName.setFont(new Font("Georgia", Font.BOLD, 20));
		txtlastName.setColumns(10);
		txtlastName.setBounds(244, 445, 435, 36);
		frmDeleteStudentForm.getContentPane().add(txtlastName);
		
		JButton button = new JButton("New button");
		button.setBounds(486, 598, 85, 21);
		frmDeleteStudentForm.getContentPane().add(button);
	}
}
