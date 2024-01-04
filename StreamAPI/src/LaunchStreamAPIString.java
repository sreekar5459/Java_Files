import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchStreamAPIString {

	public static void main(String[] args) 
	{
		ArrayList<String> laptops=new ArrayList<String>();
		laptops.add("asus");
		laptops.add("dell");
		laptops.add("lenevo");
		laptops.add("mac");
		laptops.add("microsoft");
		
		System.out.println("Different Laptops are :: "+laptops);
		System.out.println("*********************************************");
		
		//Until jdk 1.7
		
		List<String> upperCase=new ArrayList<String>();
		for(String name:laptops)
		{
			upperCase.add(name.toUpperCase());
		}
		System.out.println(upperCase);
		System.out.println("*********************************************");
		//from JDK 1.8
		
		List<String> streamList=laptops.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(streamList);
		
		System.out.println("*********************************************");
	
		streamList.forEach(name->System.out.println(name));
		
		System.out.println("*********************************************");
		
		streamList.forEach(System.out::println);
		
		

	}

}
