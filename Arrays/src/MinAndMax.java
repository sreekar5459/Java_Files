
public class MinAndMax
{
	public static void main(String [] args)
	{
		//Wap for min and max values of an array
		int [] ar= {10,90,20,80,70,40,38,942};
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
			
		}
		System.out.println("The min value of these array is : " +min);
		
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			
		}
		System.out.println("The max value of these array is : " +max);
			
	}

}
