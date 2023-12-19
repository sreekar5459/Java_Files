import java.util.*;

public class LL 
{

	public static void main(String[] args)
	{
		System.out.println("Thread-0");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("Scary");
		}
		LinkedList ll=new LinkedList();
		ll.add(49);
		ll.add(87);
		ll.add(5);
		ll.add(4);
		
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());

	}

}
