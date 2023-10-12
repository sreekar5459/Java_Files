import java.util.Arrays;

public class Sorting 
{
	public static void main(String [] args)
	{
		int [] ar= {10,20,0,0,50,60};
		Arrays.fill(ar, 2, 4, 30);
		for(int elem:ar)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		System.out.println();
		int[] arr= {20,10,90,30,4,72};
		Arrays.sort(arr);
		for(int elem:arr)
		{
			System.out.print(elem + " ");
		}
		
	}

}
