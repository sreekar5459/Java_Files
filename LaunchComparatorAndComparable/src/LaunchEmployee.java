import java.util.Comparator;
import java.util.*;

class MyComparator implements Comparator
{
	//Customized ->Sorting order or name
    @Override
	public int compare(Object o1, Object o2) 
    {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		
		String s1=e1.name;
		String s2=e2.name;
		
		return s1.compareTo(s2);
	}
	
}
class Employee implements Comparable
{
	String name;
	int eid;
	
	Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	@Override
	public String toString()
	{
		return name+ "====>"+eid;
	}
	@Override
	public int compareTo(Object o)
	{
		int id1=this.eid;
		Employee e=(Employee) o;
		int id2=e.eid;
		
		if(id1<id2)
		{
			return -1;
		}
		else if(id1>id2)
		{
			return +1;
			
		}
		else
		{
			return 0;
		}
		
	}
}
public class LaunchEmployee 
{

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(new Employee("Sachin",10));
		t.add(new Employee("Shikhar",2));
		t.add(new Employee("Rohit",45));
		System.out.println(t);

	}

}
