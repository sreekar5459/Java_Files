import java.util.*;



class MyCompartaor implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		
		if(i1<i2)
		{
		  return +1;	
		}
		else if(i1>i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
		
	}
	
}
public class LaunchComparator
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(5);
		ts.add(20);
		ts.add(20);
		System.out.println(ts);

	}

}
