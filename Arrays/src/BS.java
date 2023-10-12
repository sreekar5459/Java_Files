import java.util.Scanner;

public class BS 
{

	public static void main(String[] args) 
	{
		int [] ar= {13,16,58,10,26,73,99};
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the key to be binary searching");
		int key=scan.nextInt();
		int low=0;
		int high=ar.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==ar[mid])
			{
				System.out.println("key " +key+ " is found at index: " +mid);
				break;
			}
			else if(key<ar[mid])
			{
				high=mid-1;
				
				
			}
			else if(key>ar[mid])
			{
				low=mid+1;
				
				
			}
		}
		if(low>high)
		{
			System.out.println("Key not found");
		}
		
		

	}

}
