import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestAR1 
{

	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(40);
		
		System.out.println(ar);
		
		
		                       //Failfast
		   Iterator itr=ar.iterator();
		   while(itr.hasNext())
		    {
			    //ar.add(60);
			  System.out.println(itr.next());
		    }
			//You cannot add the values  and it results in 
			
			//Exception in thread "main" java.util.ConcurrentModificationException
            //at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
            //at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
            //at TestAR1.main(TestAR1.java:20)
		   
		
		   
		                      // FailSafe
		CopyOnWriteArrayList cowal=new CopyOnWriteArrayList();
		cowal.add(200);
		cowal.add(300);
		
		Iterator itr1=cowal.iterator();
		while(itr1.hasNext())
		{
			
			System.out.println(itr1.next());
			cowal.add(123);
		}
		
		
		
//		ListIterator litr=ar.listIterator(ar.size());
//		while(litr.hasPrevious())
//		{
//			System.out.println(litr.previous());
//		}
	}

}
