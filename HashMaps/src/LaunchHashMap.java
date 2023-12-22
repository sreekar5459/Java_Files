import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LaunchHashMap 
{

	public static void main(String[] args)
	{
		//JDK 1.2 version
		//Does Not maintains the order of insertion
		HashMap hm=new HashMap();
		hm.put(31, "Sreekar Uppalanchi");
		hm.put(32, "Ramesh Reddy");
		hm.put(33, "Harshith");
		System.out.println("HahMap-Does Not maintains the order of insertion::" +hm);
		System.out.println("=========================");

		Collection c=hm.values();
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		System.out.println("========================");
		
		Set s=hm.keySet();
		Iterator itr1=s.iterator();
		while(itr1.hasNext())
		{
			
			System.out.println(itr1.next());
		}
		System.out.println("========================");
		
		//JDK 1.4 version
		//maintains the order of insertion
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(31, "Sreekar Uppalanchi");
		lhm.put(32, "Ramesh Reddy");
		lhm.put(33, "Harshith");
		System.out.println("LinkedHasMap-maintains the order of insertion ::" +lhm);
		

	}

}
