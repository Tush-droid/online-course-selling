 package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class StudentDataManagement {

	private JFrame frmStudentDataManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDataManagement window = new StudentDataManagement();
					window.frmStudentDataManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDataManagement() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDataManagement = new JFrame();
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		
	//	frame.setBounds(100, 100, 450, 300);
	   frmStudentDataManagement.setSize(1391,894);
	   frmStudentDataManagement.setLocationRelativeTo(null);
	  
	frmStudentDataManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmStudentDataManagement.getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Student Database Management");
	lblNewLabel.setBounds(326, 10, 905, 121);
	lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 35));
	frmStudentDataManagement.getContentPane().add(lblNewLabel);
	
	JSeparator separator = new JSeparator();
	separator.setBounds(0, 108, 1429, 2);
	frmStudentDataManagement.getContentPane().add(separator);
	
	JPanel panel = new JPanel();
	panel.setBounds(236, 120, 1022, 672);
	frmStudentDataManagement.getContentPane().add(panel);
	panel.setLayout(null);
	
	JButton btnNewButton = new JButton("");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AddStudent.main(null);
		}
	});
	btnNewButton.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/user_add.png")));
	btnNewButton.setBounds(141, 10, 300, 300);
	panel.add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ShowStudent.main(null);
		}
	});
	btnNewButton_1.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/display.png")));
	btnNewButton_1.setBounds(486, 10, 300, 300);
	panel.add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			UpdateStudent.main(null);
		}
	});
	btnNewButton_2.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/user_refresh.png")));
	btnNewButton_2.setBounds(141, 353, 300, 300);
	panel.add(btnNewButton_2);
	
	JButton btnNewButton_3 = new JButton("");
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DeleteStudent.main(null);
			
		}
	});
	btnNewButton_3.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/user_delete.png")));
	btnNewButton_3.setBounds(486, 353, 300, 300);
	panel.add(btnNewButton_3);
	
	JButton btnNewButton_4 = new JButton("Back");
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frmStudentDataManagement.setVisible(false);
		}
	});
	btnNewButton_4.setFont(new Font("Georgia", Font.BOLD, 23));
	btnNewButton_4.setBounds(220, 814, 91, 35);
	frmStudentDataManagement.getContentPane().add(btnNewButton_4);
	
	JButton btnNewButton_4_1 = new JButton("Exit");
	btnNewButton_4_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
	btnNewButton_4_1.setFont(new Font("Georgia", Font.BOLD, 23));
	btnNewButton_4_1.setBounds(1177, 814, 91, 35);
	frmStudentDataManagement.getContentPane().add(btnNewButton_4_1);
	}
}
