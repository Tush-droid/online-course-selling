package mainpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHandling {
	Connection con ;
	PreparedStatement pstmt;
	Statement stmt;
    ResultSet result;



	JDBCHandling(){



		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Arey bhai Driver mil gaya!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}





		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newproject", "root", "9673");
			System.out.println("Got Connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}


	int insertData(String firstName,String lastName,long mobile,String address,String gender,String degree,String dob,String subject1,String subject2) {
		int status=0;




		try {
			pstmt=con.prepareStatement("insert into studenttable values(default,?,?,?,?,?,?,?,?,?)");



			pstmt.setString(1,firstName);
			pstmt.setString(2,lastName);
			pstmt.setLong(3,mobile);
			pstmt.setString(4, address);
			pstmt.setString(5,gender);
			pstmt.setString(6,degree);
			pstmt.setString(7,dob);
			pstmt.setString(8,subject1);
			pstmt.setString(9,subject2);



			status=pstmt.executeUpdate();



		} 


		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;




	}
	ResultSet getTable(){




		try {
			stmt=  con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		try {
			result= stmt.executeQuery("select * from studenttable");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


		return  result;
	}
		
		
		
		
	ResultSet getRow(int SerialNumber) {
			
			try {
				
				stmt=con.createStatement();
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			String query="select * from studenttable where serialnumber =" + SerialNumber;
			
			try {
				result=stmt.executeQuery(query);
				
			} catch (Exception e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
		return result;
	}

	
	
		int insertUpdate (String firstName,String lastName,long mobile,String address,String gender,String degree,String dob,String subject1,String subject2) {
			int status=0;
			{




			try {
				pstmt=con.prepareStatement("update studenttable set firstName=?,lastname = ?,mobile=?,address=?,gender=?,degree=?,dob=?,subject1=?,subject2=?)");



				pstmt.setString(1,firstName);
				pstmt.setString(2,lastName);
				pstmt.setLong(3,mobile);
				pstmt.setString(4, address);
				pstmt.setString(5,gender);
				pstmt.setString(6,degree);
				pstmt.setString(7,dob);
				pstmt.setString(8,subject1);
				pstmt.setString(9,subject2);



				status=pstmt.executeUpdate();



			} 


			catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

			return status;
			}}
			

		

			int deleteUpdate(int serialNumber) {
				int status=0;
				
	try {
					
					pstmt=con.prepareStatement("delete from studenttable where serialNumber = ?");
					pstmt.setInt(1, serialNumber);
					
					status=pstmt.executeUpdate();
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				return status;
			
				
			


		}	
		
		}





