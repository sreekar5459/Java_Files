
public class NestedIf 
{

	public static void main(String [] args)
	{
		int a=10, b=30,c=5;
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("A is the least number: " +a);
			}
			else
			{
				System.out.println("C is the least number: " +c);
			}
		}
		else if(b<c)
		{
			System.out.println("B is the least number: " +b);
		}
		else 
		{
			System.out.println("C is the least number: " +c);
					
		}
			
	
	}
		
}

