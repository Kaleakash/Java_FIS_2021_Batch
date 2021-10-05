package com.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Employee;

@Repository					// DAO layer specific annotation object creation taken care by container 
public class EmployeeDao {		// id employeeDao 
		
		@Autowired
		SessionFactory sf;				// DI for session factory it is like Connection		
		public int storeEmployee(Employee emp) {
			
						Session session = sf.openSession();	// Session is a interface which provide set of methods do to operation on entity 
						Transaction tran = session.getTransaction();
						tran.begin();
							session.save(emp);			// DML Operation 
						tran.commit();
						
						// select * from employee where id = 1;
						Employee e = session.get(Employee.class, emp.getId());		// get record using primary key
						
						if(e==null) {
							return 0;
						}else {
							return 1;
						}
		} 
}
