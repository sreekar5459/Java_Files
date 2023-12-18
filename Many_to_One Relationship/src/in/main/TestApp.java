package in.main;

import in.bean.Branch;
import in.bean.Employee;

public class TestApp {

	public static void main(String[] args)
	{
		Branch branch=new Branch();
		branch.setBid("11");
		branch.setBname("SD-II");
		
		Employee e1=new Employee();
		e1.setEid("34");
		e1.setEname("Sreekar");
		e1.setEaddress("Rameswaram");
		e1.setBranch(branch);
		
		Employee e2=new Employee();
		e2.setEid("32");
		e2.setEname("karni");
		e2.setEaddress("palikad");
		e2.setBranch(branch);
		
		Employee e3=new Employee();
		e3.setEid("342");
		e3.setEname("nima");
		e3.setEaddress("kadkil");
		e3.setBranch(branch);
		
		System.out.println("Employee Details:");
		System.out.println("Employee Id: " +e1.getEid());
		System.out.println("Employee name: "+e1.getEname());
		System.out.println("employee Address: "+e1.getEaddress());
		System.out.println("Branch ID: "+e1.getBranch().getBid());
		System.out.println("Branch name: " +e1.getBranch().getBname());
		System.out.println("-----------------");
		System.out.println(" ");
		
		System.out.println("Employee Details:");
		System.out.println("Employee Id: " +e2.getEid());
		System.out.println("Employee name: "+e2.getEname());
		System.out.println("employee Address: "+e2.getEaddress());
		
		System.out.println("Branch ID: "+e2.getBranch().getBid());
		System.out.println("Branch name: " +e2.getBranch().getBname());
		System.out.println("-----------------");
		System.out.println("");
		
		System.out.println("Employee Details:");
		System.out.println("Employee Id: " +e3.getEid());
		System.out.println("Employee name: "+e3.getEname());
		System.out.println("employee Address: "+e3.getEaddress());
		System.out.println("Branch ID: "+e3.getBranch().getBid());
		System.out.println("Branch name: " +e3.getBranch().getBname());


	}

}
