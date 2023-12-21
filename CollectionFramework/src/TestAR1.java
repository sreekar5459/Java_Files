import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestAR1 
{

	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(40);
		
		System.out.println(ar);
		
		Iterator itr=ar.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer) itr.next();
			System.out.println(i);
			//ar.add(60);//You cannot add the values its result with fail fast or Failsafe and also 
			//result in
			//Exception in thread "main" java.util.ConcurrentModificationException
            //at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
            //at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
            //at TestAR1.main(TestAR1.java:20)
		}
		
		ListIterator litr=ar.listIterator(ar.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}

}
