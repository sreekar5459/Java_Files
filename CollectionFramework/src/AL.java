import java.util.*;
public class AL
{

	public static void main(String[] args)
	{
		//Dynamic Homogeneous data
		ArrayList al=new ArrayList();
		al.add(2);
		al.add(4);
		al.add(5);
		System.out.println(al);
		
		Iterator itr=al.iterator();	
		while(itr.hasNext())
		{
			Integer i=(Integer) itr.next();
			System.out.println(i);
		}
		
		
		//In collection if you add the data that will be stored 
		// in the form Object
		
		System.out.println("");
		
		//Dynamic Heterogeneous data
		ArrayList al2=new ArrayList();
		al2.add("Sreekar");
		al2.add('U');
		al2.add(27);
		al2.add(17.48);
		
		System.out.println(al2);
		
		//We can add entire collection into another collection
		
		ArrayList al3=new ArrayList();
		al3.addAll(al2);
		System.out.println(al3);
		

	}

}
