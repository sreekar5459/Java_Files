import java.util.Scanner;
class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
	
}
class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
	
}
class Application
{
	int age;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the age: ");
		age=scan.nextInt();
	}
	public void verify() throws Exception
	{
		if(age<18)
		{
			UnderAgeException uae=new UnderAgeException("Didn't match the age criteria");
			System.out.println(uae.getMessage());
			throw uae;
			
			//System.out.println("Didn't match the age criteria");
		}
		else if(age>60)
		{
			OverAgeException oae=new OverAgeException("Age Restriction Didn't match");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("Age Verified ");
		}
	}
}
class RTO
{
	public void display()
	{
	Application a=new Application();
	
	try 
	{
		a.input();
		a.verify();
	}
	catch (Exception e) 
	{
		try 
		{
			a.input();
			a.verify();
		}
		catch (Exception e1) 
		{
			System.out.println("Account locked!!");
			System.exit(0);
			
		}
		
	}
	}
	
}
public class RTOApplication
{

	public static void main(String[] args)
	{
		RTO r=new RTO();
		r.display();

	}

}
