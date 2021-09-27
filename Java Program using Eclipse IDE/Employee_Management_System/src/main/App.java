package main;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import bean.Employee;
import service.EmployeeService;
public class App {
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		String con = "";
		Scanner obj = new Scanner(System.in);
		do {
				System.out.println("1: Add Employee 2: Display Employee Details");
				System.out.println("Plz enter your choice");
				int ch = obj.nextInt();
				switch(ch) {
				case 1 :System.out.println("Enter the id");
							int id = obj.nextInt();
							System.out.println("Enter the name");
							String name = obj.next();
							System.out.println("Enter the salary");
							float salary = obj.nextInt();
							Employee emp = new Employee(id, name, salary);
							if(es.addEmployee(emp)) {
								System.out.println("Record stored successfully");
							}else {
								System.out.println("Record didn't store");
							}
							break;
				case 2: 	List<Employee> listOfEmp = es.getAllEmployeeDetails();
								if(listOfEmp.size()==0) {
									System.out.println("Record are not present");
								}else {
									Iterator<Employee> ii  = listOfEmp.iterator();
									while(ii.hasNext()) {
												Employee e= ii.next();
												System.out.println(e);
									}
								}
								break;
				}
				System.out.println("Do you want to continue?(y/n)");
				con = obj.next();
		}while(con.equalsIgnoreCase("y"));
		System.out.println("Thank You!");
	}
}
