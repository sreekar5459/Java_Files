import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LaunchSet 
{

	public static void main(String[] args) 
	{
		//1.TreeSet 2.HashSet 3.LinkedHashSet
		
		TreeSet<Integer> numbers=new TreeSet();
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(4);
		
		
		System.out.println("TreeSet is :" +numbers);
		System.out.println("----------------------------");
		
		//output is ::[1,2,3,4]
		
		HashSet<Integer> num=new HashSet();
		num.add(6);
		num.add(4);
		num.add(10);
		
	    System.out.println("HashSet is ::" +num);
	    System.out.println("----------------------------");
	    
	  //output is ::[6,4,10]
	  //output is ::[4,6,10]
	  //output is ::[10,6,4]
	    //The thing is you can't predict the output
	    
	    LinkedHashSet<Integer> num1=new LinkedHashSet();
		num1.add(6);
		num1.add(4);
		num1.add(10);
		
		 System.out.println("LinkedHashSet is ::" +num1);
		 System.out.println("------------------------------");
		 
		 //You can predict the output 
		  //output is ::[6,4,10]
		

	}

}
