package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frmMInfinityEngineering;
	private JTextField txtname;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmMInfinityEngineering.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMInfinityEngineering = new JFrame();
		frmMInfinityEngineering.getContentPane().setFont(new Font("Calibri", Font.BOLD, 40));
		frmMInfinityEngineering.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/Images/logo.jpg")));
		frmMInfinityEngineering.setTitle("N Infinity Engineering academy");
		
		
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmMInfinityEngineering.setLocationRelativeTo(null);
	
		frmMInfinityEngineering.setSize(width/2,height/2);
		//frame.setBounds(100, 100, 450, 300);
		frmMInfinityEngineering.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMInfinityEngineering.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N Infinity Engineering Academy");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 26));
		lblNewLabel.setBounds(104, 29, 594, 57);
		frmMInfinityEngineering.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(51, 76, 658, 2);
		frmMInfinityEngineering.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 17));
		lblNewLabel_1.setBounds(51, 113, 150, 46);
		frmMInfinityEngineering.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(51, 179, 150, 46);
		frmMInfinityEngineering.getContentPane().add(lblNewLabel_1_1);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Georgia", Font.BOLD, 20));
		txtname.setBounds(189, 123, 453, 31);
		frmMInfinityEngineering.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(728, 298, -704, -16);
		frmMInfinityEngineering.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 308, 721, 2);
		frmMInfinityEngineering.getContentPane().add(separator_2);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loginname=txtname.getText();
				String password=txtpassword.getText();
				//int password =Integer.parseInt(txtpassword.getText());
				
				System.out.println(loginname+"   " + password);
				
				if(loginname.equals("tushar")&& password.equals("beast")) {
					System.out.println("Login Sucsessful");
				
				MainEntryPage.main(null);
				}
			
				else {
					System.out.println("Invalid user");
					
				}
				
				
			}
		});
		btnlogin.setFont(new Font("Georgia", Font.BOLD, 16));
		btnlogin.setBounds(26, 334, 150, 31);
		frmMInfinityEngineering.getContentPane().add(btnlogin);
		
		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Georgia", Font.BOLD, 20));
		txtpassword.setBounds(189, 189, 448, 31);
		frmMInfinityEngineering.getContentPane().add(txtpassword);
		
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtname.setText(null);
				txtpassword.setText(null);
				
			}
		});
		btnreset.setFont(new Font("Georgia", Font.BOLD, 16));
		btnreset.setBounds(293, 334, 150, 31);
		frmMInfinityEngineering.getContentPane().add(btnreset);
		
		JButton btnexit = new JButton("Exit");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnexit.setFont(new Font("Georgia", Font.BOLD, 16));
		btnexit.setBounds(559, 334, 150, 31);
		frmMInfinityEngineering.getContentPane().add(btnexit);
	}
}
