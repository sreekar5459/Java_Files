import java.util.Comparator;
import java.util.*;

class MyCompartor2 implements Comparator
{

	@Override
	public int compare(Object ob1, Object ob2)
	{
             String sb1= ob1.toString();
             String sb2= ob2.toString();
              
              return -sb2.compareTo(sb1);
              
	}
	
}
public class LaunchStringBuffer 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyCompartor2());
		
		t.add(new StringBuffer("Sachin"));
		t.add(new StringBuffer("Shikhar"));
		t.add(new StringBuffer("Sehwag"));
		t.add(new StringBuffer("Sourav"));
		t.add(new StringBuffer("Sammy"));
		
		System.out.println(t);

	}

}
