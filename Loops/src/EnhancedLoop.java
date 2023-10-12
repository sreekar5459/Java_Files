
public class EnhancedLoop
{
	public static void main(String [] args)
	{
	// In enhanced for loop you don't have access to index and it will traverse or iterate only in the forward direction
		
		//int [] ar= {10,20,30,40,50};
		int [][] a= {{10,20},{30,40,50,60},{70,80,90}};
		for(int [] arr:a)
		{
		   for(int elem:arr)
		     {
			   System.out.print(elem + " ");
		     }
		   System.out.println();
		}
	}

	
}
