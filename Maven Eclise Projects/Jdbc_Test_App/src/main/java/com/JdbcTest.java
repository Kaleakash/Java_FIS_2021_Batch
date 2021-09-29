package com;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");	// my sql 5 version 
		Class.forName("com.mysql.cj.jdbc.Driver");		// my sql 8 version 
		System.out.println("Driver Loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisdb", "root", "root@123");
		System.out.println("Connected successfully");
		Statement stmt = con.createStatement();
// 		Retrieve Query 
//		ResultSet rs = stmt.executeQuery("select  * from employee");
//		while(rs.next()) {
//			//System.out.println(" id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary "+rs.getFloat(3));
//			System.out.println(" id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary "+rs.getFloat("salary"));
//		}
//		rs.close();
//		// Insert Query 
//		int res = stmt.executeUpdate("insert into employee values(5,'Balaji',22000)");
//		if(res>0) {
//			System.out.println("Record stored successfully");
//		}
		// delete Query 
//				int res = stmt.executeUpdate("delete from employee where id = 5");
//				if(res>0) {
//					System.out.println("Record deleted successfully");
//				}else {
//					System.out.println("Record not present");
//				}
		// Update Query 
		int res = stmt.executeUpdate("update Employee set salary = 25000 where id = 10");
		if(res>0) {
			System.out.println("Record updated successfully");
		}else {
			System.out.println("Record not present");
		}
		stmt.close();
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
