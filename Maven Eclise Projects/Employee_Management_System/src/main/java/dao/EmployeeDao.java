package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import resource.DbConnection;

public class EmployeeDao {
		Connection con;
		public EmployeeDao() {
			//DbConnection obj = new DbConnection();
			//con = obj.getDbConnection();
			con = DbConnection.getDbConnection();
		}
			public List<Employee> rertieveEmployeeDetails() {
				List<Employee> listOfEmp = new ArrayList<>();
				try {
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from employee");
					while(rs.next()) {
						Employee emp = new Employee();
						emp.setId(rs.getInt(1));
						emp.setName(rs.getString(2));
						emp.setSalary(rs.getFloat(3));		// converting each record to java object. 
						listOfEmp.add(emp);						// add the object in list 
					}
				}catch(Exception e) {
					System.out.println(e);
				}
				return listOfEmp;
			}
			
			public int storeEmployeeDetails(Employee emp) {
				try {
					PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
					pstmt.setInt(1, emp.getId());
					pstmt.setString(2, emp.getName());
					pstmt.setFloat(3, emp.getSalary());
					return pstmt.executeUpdate();		// return int if insert return 1
				}catch(Exception e) {
					System.out.println(e);
				}
				return 0;
			}
}
