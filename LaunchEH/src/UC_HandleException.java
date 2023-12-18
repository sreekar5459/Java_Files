import java.util.Scanner;
class Handle
{
	void display() throws ArithmeticException
	{
		try
		{
	    System.out.println("Print the values");
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the 1st number:");
		int num1=scan.nextInt();
		System.out.print("Enter the 2nd number:");
		int num2=scan.nextInt();
		
		int res=num1/num2;
		System.out.println("The result is ::"+res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception handled in display");
			throw ae;
		}
		finally 
		{
		System.out.println("Connection has ended. Thank you");
		}
	}
}


public class UC_HandleException 
{

	public static void main(String... args)
	{
		System.out.println("Main method");
		try 
		{
			Handle h=new Handle();
			h.display();
		}
		catch(ArithmeticException ae)
		{
		
			System.out.println("!!!Card Blocked!!!");
		}
	}

}
