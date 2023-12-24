import java.util.HashMap;
import java.util.WeakHashMap;

class Employee
{
	private String name;
	private String Address;
	
	@Override
	public String toString()
	{
		return "Name";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("garbage collector");
	}
}
public class LaunchGC 
{

	public static void main(String[] args)
	{
		Employee emp=new Employee();
		WeakHashMap hm=new WeakHashMap();
		hm.put(emp, "Sreekar");
		System.out.println(hm);
		emp=null;
		System.gc();
		System.out.println("lastLIne");
	}

}
