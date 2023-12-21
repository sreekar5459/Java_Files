import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ALL 
{

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.addFirst(20);
		ll.add(7);
		ll.addLast(89);
		ll.add(42);
		
		System.out.println("LinkedList is :: "+ll);
//		
//		Iterator itr=ll.iterator();
//		while(itr.hasNext())
//		{
//			Integer i=(Integer) itr.next();
//			System.out.println("The Iterator is ::" +i);
//		}
//		
//		System.out.println("****************");
//		
//		ListIterator litr=ll.listIterator(ll.size());
//		while(litr.hasPrevious())
//		{
//			System.out.println("The ListIterator is ::" +litr.previous());
//		}
		
		
		//Desecending the values using descendingIterator
		Iterator ditr=ll.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}

	}

}
