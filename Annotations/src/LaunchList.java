import java.util.ArrayList;
import java.util.LinkedList;

public class LaunchList
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0, 10);
		al.add(1, 30);
		al.add(2, 30);
		al.add(3, 3);
		
		System.out.println(al);
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(0, 10);
		ll.add(1, 30);
		ll.add(2, 30);
		ll.add(3, 5);
		
		System.out.println(ll);

	}

}
