import java.util.stream.Stream;

public class launchBinaryStream {

	public static void main(String[] args)
	{
		Stream s=Stream.of(9,10,20,40);
		s.forEach(System.out::println);
		
		Double[] d= {10.0,12.4,13.8};
		Stream s1=Stream.of(d);
		s1.forEach(System.out::println);
		
		

	}

}
