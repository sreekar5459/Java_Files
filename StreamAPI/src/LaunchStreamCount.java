import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchStreamCount {

	public static void main(String[] args)
	{
		ArrayList<String> counting=new ArrayList<String>();
		counting.add("Speakers");
		counting.add("Phone");
		counting.add("Headsets");
		counting.add("Mouse");
		counting.add("StudyLamp");
		
		System.out.println(counting);
		System.out.println("********************************************************");
		
		//Below steps are both same but different approach
		List<String> result=counting.stream().filter(count->count.length()>7).collect(Collectors.toList());
		System.out.println(result.size());
		
		
		long c=counting.stream().filter(count->count.length()>7).count();
		System.out.println(c);
		

	}

}
