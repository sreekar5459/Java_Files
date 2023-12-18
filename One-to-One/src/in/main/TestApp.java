package in.main;

import in.bean.Employee;
import in.bean.Owner;

public class TestApp {

	public static void main(String[] args) {
		
		Owner owner=new Owner("Ramesh","Palikad");
		Employee emp=new Employee("Sreekar","Uppal",owner);
		emp.getEmployeeDetails();

	}

}
