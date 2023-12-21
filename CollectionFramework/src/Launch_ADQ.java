import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

public class Launch_ADQ 
{

	public static void main(String[] args)
	{
		ArrayDeque adq=new ArrayDeque();
		adq.add(30);
		adq.add(40);
		adq.add(2);
		adq.add(87);
		adq.add(32);
		adq.add(87);
		System.out.println(adq);
		
		Iterator itr=adq.iterator();
		
		while(itr.hasNext())
		{
			Integer i=(Integer) itr.next();
			System.out.print(" ArrayDeque: " +i);
		}
		System.out.println();
		LinkedList ll=new LinkedList();
		ll.addAll(adq);
		System.out.println(ll);
	}

}
