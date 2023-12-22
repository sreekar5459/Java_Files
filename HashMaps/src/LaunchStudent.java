import java.util.*;
import java.util.Map.Entry;


class Student
{
	private String name;
	private int sid;
	private String stream;
	private int phoneNo;
	
	  public Student(String name, int sid, String stream, int phoneNo)
	  {
		
		this.name = name;
		this.sid = sid;
		this.stream = stream;
		this.phoneNo = phoneNo;
	  }

	 public String getName() 
	 {
		return name;
	 }

	public int getSid()
	{
		return sid;
	}

	public String getStream() 
	{
		return stream;
	}

	public int getPhoneNo()
	{
		return phoneNo;
	}
	@Override
	public String toString()
	{
		return name+ "    " +sid+ "  " +stream+ "  " +phoneNo;
		
	}
	  
	  
	
}
public class LaunchStudent
{

	public static void main(String[] args)
	{
		Student s1=new Student("Sree",31,"IT",5021);
		Student s2=new Student("karan",11,"IT",5728);
		Student s3=new Student("Ramesh",31,"IT",5592);
		
		HashMap hm=new HashMap();
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
		
		Collection col=hm.values();
		Iterator itr=col.iterator();
		while(itr.hasNext())
		{
			System.out.println("Value is: "+itr.next());
		}
		System.out.println("***********************");
		Set extractSet=hm.keySet();
		Iterator itr1=extractSet.iterator();
		while(itr1.hasNext())
		{
			System.out.println("key is: "+itr1.next());
		}
		System.out.println("************************");
		
        Set getValues=hm.entrySet();
        Iterator itr2=getValues.iterator();
        while(itr2.hasNext())
        {
        	Map.Entry entry=(Entry) itr2.next();
        	
        	System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
	}

}
