package in.main;

import in.beanClass.Department;
import in.beanClass.Employee;

public class TestApp {

	public static void main(String[] args)
	{
		Employee e1=new Employee("982","Sreekar","Uppal");
		Employee e2=new Employee("123","Ramesh","Nizambad");
		Employee e3=new Employee("1554","Deepu","palikad");
		
		Employee[] emps=new Employee[3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		
		Department dept =new Department("B12","SoftwareDevelopment",emps);
		dept.getDepartmentDetails();
		
		

	}

}
