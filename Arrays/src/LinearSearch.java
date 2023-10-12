import java.util.*;

public class LinearSearch 
{
	public static void main(String [] args)
	{
		int [] ar= {13,16,10,26,73,99};
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the key to search");
		int key=scan.nextInt();
		
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				System.out.println("key " +key+ " found at index " +i);
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{
		System.out.println("key not found");
		}
	}

}
