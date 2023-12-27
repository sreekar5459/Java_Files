import java.util.TreeSet;

public class LaunchComparable 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add("A");
		ts.add("Z");
		ts.add("K");

		System.out.println(ts);
		
		System.out.println("A".compareTo("D"));
		System.out.println("Z".compareTo("Y"));
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo(null));
		
		
	}

}
