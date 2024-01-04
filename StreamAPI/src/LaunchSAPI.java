import java.util.ArrayList;
import java.util.stream.Stream;

public class LaunchSAPI
{

	public static void main(String[] args) 
	{
		ArrayList <String> al=new ArrayList<String>();
		al.add("Book");
		al.add("QuakersOats");
		al.add("Keyboard");
		
		System.out.println(al);
		
		
		
		//Stream API
		Stream<String> str=al.stream();
		System.out.println(str);
		System.out.println(str.getClass().getName());

	}

}
