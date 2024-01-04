import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchStreamInteger {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(18);
		al.add(8);
		al.add(0);
		al.add(13);
		al.add(31);
		System.out.println(al);
System.out.println("**************");
		
		List<Integer> result=al.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
System.out.println("**************");
		
		List<Integer> result1=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(result1);
		
System.out.println("**************");
		
		Integer result3=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(result3);
		
System.out.println("**************");
		
		Integer result4=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(result4);
		
		
		

	}

}
