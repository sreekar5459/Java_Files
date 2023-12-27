import java.util.Comparator;
import java.util.*;


class MyComparator1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		String s1=(String)o1.toString();
		String s2=o2.toString();
		
		return s2.compareTo(s1);
	}
	
}
public class LaunchStringObjects 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("Shikhar");
		t.add("Rohit");
		t.add("Dale Styen");
		t.add("Brain Lara");
		t.add("TravisHead");
		
		System.out.println(t);

	}

}
