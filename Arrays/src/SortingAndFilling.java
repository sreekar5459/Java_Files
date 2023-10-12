import java.util.Arrays;

public class SortingAndFilling {

	public static void main(String[] args) 
	{
		int[] ar= {40,20,30,10,20,50};
		//Arrays.fill(ar,3,5,40);
		for(int elem:ar)
		{
			System.out.print(elem+ " ");
		}
		System.out.println();
		Arrays.sort(ar);
		for(int elem:ar)
		{
			System.out.print(elem+ " ");
		}

	}

}
