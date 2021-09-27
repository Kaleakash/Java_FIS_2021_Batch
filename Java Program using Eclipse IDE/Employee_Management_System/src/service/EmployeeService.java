package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Employee;

public class EmployeeService {
	List<Employee> listOfEmployee = new ArrayList<>();
	
	public boolean addEmployee(Employee emp) {
		int flag =0;
		if(listOfEmployee.size()==0) {
			listOfEmployee.add(emp);
			return true;
		}else {
			Iterator<Employee> ii = listOfEmployee.iterator();
			while(ii.hasNext()) {
				Employee e = ii.next();
				if(e.getId()==emp.getId()) {
					flag++;
					break;
				}
			}
			if(flag==0) {
				listOfEmployee.add(emp);
				return true;
			}else {
				return false;
			}
		}
		
	}
	public List<Employee> getAllEmployeeDetails() {
		return listOfEmployee;
	}
	
	
}



