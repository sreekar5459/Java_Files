package in.bean;

public class Employee
{
     private String name;
     private String address;
     
     private Owner owner;

	public Employee(String name, String address, Owner owner) 
	{
		super();
		this.name = name;
		this.address = address;
		this.owner = owner;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee details::");
		System.out.println("Employee name: "+name);
		System.out.println("Employee address: "+address);
		System.out.println("---------------");
		System.out.println("Owner Details:");
		System.out.println("Owner name: "+owner.name);
		System.out.println("Owner Address: "+owner.address);
	}
     
	 
	
     
     
}
