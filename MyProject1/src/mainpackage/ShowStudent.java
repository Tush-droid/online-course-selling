package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ShowStudent {

	private JFrame frmStudentDatabaseFrame;

	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStudent window = new ShowStudent();
					window.frmStudentDatabaseFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDatabaseFrame = new JFrame();
		frmStudentDatabaseFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(ShowStudent.class.getResource("/Images/logo.jpg")));
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmStudentDatabaseFrame.setSize(1490, 895);
		frmStudentDatabaseFrame.setLocationRelativeTo(null);

		frmStudentDatabaseFrame.setTitle("Student Database Frame");
		//frmStudentDatabaseFrame.setBounds(250, 100, 1050, 800);
		frmStudentDatabaseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentDatabaseFrame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Student database");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 35));
		lblNewLabel.setBounds(505, 3, 654, 65);
		frmStudentDatabaseFrame.getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 66, 1427, 2);
		frmStudentDatabaseFrame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 686, 1427, 2);
		frmStudentDatabaseFrame.getContentPane().add(separator_1);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentDatabaseFrame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 20));
		btnNewButton.setBounds(36, 707, 188, 33);
		frmStudentDatabaseFrame.getContentPane().add(btnNewButton);

		JButton btnPrint = new JButton("Show");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBCHandling db=new JDBCHandling();
				ResultSet result=db.getTable();


				DefaultTableModel model=new DefaultTableModel();
				String[]columnNames= {"Serial Number","First Name","Last Name","mobile","Address","Gender","degree","DOB","Subject1","Subject2"

				};
				model.setColumnIdentifiers(columnNames);


				try {
					while(result.next()) {
						model.addRow(new Object[] {
								result.getInt(1),
								result.getString(2),
								result.getString(3),
								result.getLong(4),
								result.getString(5),
								result.getString(6),
								result.getString(7),
								result.getString(8),
								result.getString(9),
								result.getString(10),		

						});
					}
				} catch (Exception e2) {

					// TODO: handle exception
					e2.printStackTrace();
				}

				table_1.setModel(model);
				table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

				try {
					result.close();
				} catch (SQLException e1) {
					// TODO: handle exception
					e1.printStackTrace();

				}	
			}
		});
		btnPrint.setFont(new Font("Georgia", Font.BOLD, 20));
		btnPrint.setBounds(592, 707, 188, 33);
		frmStudentDatabaseFrame.getContentPane().add(btnPrint);

		JButton btnClose = new JButton("close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Georgia", Font.BOLD, 20));
		btnClose.setBounds(1188, 707, 188, 33);
		frmStudentDatabaseFrame.getContentPane().add(btnClose);

		JScrollPane scrollPane =  new JScrollPane();
		scrollPane.setBounds(20, 78, 1446, 587);
		frmStudentDatabaseFrame.getContentPane().add(scrollPane);

		table_1 = new JTable();
		table_1.setFont(new Font("Georgia", Font.BOLD, 16));
		table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Serial Number", "First Name", "Last Name", "mobile", "Address", "Gender", "degree", "DOB", "Subject1", "Subject2"
				}
				));
		table_1.setFont(new Font("Georgia",Font.BOLD,12));
		scrollPane.setViewportView(table_1);

	}
}
