package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository					// DAO layer specific annotation object creation taken care by container 
public class EmployeeDao {		// id employeeDao 
		@Autowired
		DataSource ds;	
		public int storeEmployee(Employee emp) {
				try {
				Connection con = ds.getConnection();			// pull the database details from xml file 
				PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
				pstmt.setInt(1, emp.getId());
				pstmt.setString(2, emp.getName());
				pstmt.setFloat(3, emp.getSalary());
				return pstmt.executeUpdate();
				}catch(Exception e) {
					System.out.println(e);
				}
				return 0;
		} 
}
