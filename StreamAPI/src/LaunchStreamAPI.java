import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//collection: To Represent a group of individual object in a single entity is called collection
//Stream    : To process a group of objects from a collection is called Stream

                         // Two types of Stream
     //1.java.util.stream: It is meant for processing the objects from the collection                
     //2.java.io.stream  :It is meant for processing the binary and character data from the file

public class LaunchStreamAPI {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(3);
		al.add(23);
		al.add(16);
		al.add(7);
		
		System.out.println(al);
		
		System.out.println("********************");
		
		//Till jdk 1.7
		
//		ArrayList<Integer> evenList=new ArrayList<Integer>();
//		for(Integer elem:al)
//		{
//			if(elem%2==0)
//			{
//				System.out.println(elem+ " ");
//			}
//		}
//		System.out.println("********************");
		
		  //Using Stream API
		 //1.Configuration
//		//2.Processing
//		List<Integer> streamList=al.stream().filter(elem->elem%2==0).collect(Collectors.toList());
//		System.out.println("");
//		System.out.println(streamList);
//		System.out.println("");
//		System.out.println("********************");
//		streamList.forEach(System.out::println);
		
		//till jdk 1.7
		//DoubleList
		ArrayList<Integer> doubleList=new ArrayList<Integer>();
		for(Integer elem:al)
		 doubleList.add(elem*2);
	     System.out.println(doubleList);
		
	     //During 1.8Jdk
	     List<Integer> streamList1=al.stream().map(obj->obj*2).collect(Collectors.toList());
	     System.out.println();
	     streamList1.forEach(System.out::println);

	}

}
