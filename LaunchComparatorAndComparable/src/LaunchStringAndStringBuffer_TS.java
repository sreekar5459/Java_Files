import java.util.Comparator;
import java.util.TreeSet;

class MyCompartor implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		String s1=o1.toString();
		String s2=o2.toString();
		
		int i1=s1.length();
		int i2=s2.length();
		
		if(i1<i2)
		{
			return -1;
		}
		else if(i1>i2)
		{
			return +1;
		}
		else
		{
			return s1.compareTo(s2);
		}
	}
	
}
public class LaunchStringAndStringBuffer_TS
{

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new MyCompartor());
		
		t.add("Sachin");
		t.add("Shikhar");
		t.add("Rohit");
		t.add("Dale Styen");
		t.add("Brain Lara");
		t.add("TravisHead");
		t.add("DavidWarner");
		t.add(new StringBuffer("Dhoni"));
		t.add(new StringBuffer("Messi"));
		
		
		
		System.out.println(t);

	}

}
