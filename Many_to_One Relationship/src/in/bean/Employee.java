package in.bean;


//Target Object
public class Employee
{
  private String eid;
  private String ename;
  private String eaddress;
  
  //Has-A variable
   Branch branch;

public String getEid() {
	return eid;
}

public void setEid(String eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getEaddress() {
	return eaddress;
}

public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}

public Branch getBranch() {
	return branch;
}

public void setBranch(Branch branch) {
	this.branch = branch;
}
  
  
}
