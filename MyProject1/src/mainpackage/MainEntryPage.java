package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainEntryPage {

	private JFrame frmNInfinityEngineering;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEntryPage window = new MainEntryPage();
					window.frmNInfinityEngineering.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainEntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNInfinityEngineering = new JFrame();
		frmNInfinityEngineering.setIconImage(Toolkit.getDefaultToolkit().getImage(MainEntryPage.class.getResource("/Images/logo.jpg")));
		frmNInfinityEngineering.setTitle("N Infinity Engineering Academy Main Entry Page");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmNInfinityEngineering.setSize(1429,770);
		frmNInfinityEngineering.setLocationRelativeTo(null);
		//frmNInfinityEngineering.setBounds(100, 100, 450, 300);
		frmNInfinityEngineering.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNInfinityEngineering.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Param Academy");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 35));
		lblNewLabel.setBounds(183, 44, 1012, 80);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 161, 1370, 2);
		frmNInfinityEngineering.getContentPane().add(separator);
		
		JButton btnstaff = new JButton("");
		btnstaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnstaff.setIcon(new ImageIcon(MainEntryPage.class.getResource("/Images/staff.png")));
		btnstaff.setBounds(235, 272, 298, 300);
		frmNInfinityEngineering.getContentPane().add(btnstaff);
		
		JButton btnstudent = new JButton("");
		btnstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			StudentDataManagement.main(null);
			}
		});
		btnstudent.setIcon(new ImageIcon(MainEntryPage.class.getResource("/Images/student.png")));
		btnstudent.setBounds(897, 272, 298, 300);
		frmNInfinityEngineering.getContentPane().add(btnstudent);
		
		JLabel lblNewLabel_1 = new JLabel("                Staff");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 27));
		lblNewLabel_1.setBounds(235, 216, 252, 49);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.BOLD, 27));
		lblNewLabel_1_1.setBounds(999, 216, 252, 49);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 664, 1332, 2);
		frmNInfinityEngineering.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNInfinityEngineering.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 13));
		btnNewButton.setBounds(84, 686, 192, 37);
		frmNInfinityEngineering.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Georgia", Font.BOLD, 13));
		btnExit.setBounds(1033, 686, 192, 37);
		frmNInfinityEngineering.getContentPane().add(btnExit);
	}
}
