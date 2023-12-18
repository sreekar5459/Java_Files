import java.util.Scanner;

class ICException extends Exception
{
	public ICException(String msg)
	{
		super(msg);
	}
}
class Bank1
{
	int username=1213;
	int pin=5459;
	int user;
	int pw;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the username: ");
		user=scan.nextInt();
		System.out.print("Enter the pin: ");
		pw=scan.nextInt();
		
	}
	public void verify() throws ICException 
	{
		if((username==user)&&(pin==pw))
		{
			System.out.println("Verified take cash");
		}
		else
		{
			ICException ice=new ICException("Are you sure??");
			System.out.println(ice.getMessage());
			System.out.println(ice.getStackTrace());
			System.out.println(ice.getLocalizedMessage());
			throw ice;
			
		}
	}
}

class Atm
{
	public void iniate()
	{
	Bank1 b=new Bank1();
	
	
	try 
	{
		b.input();
		b.verify();
	} 
	catch (ICException e) 
	{
		try 
		{
			b.input();
			b.verify();
		} 
		catch (ICException ae) 
		{
			try 
			{
				b.input();
				b.verify();
			} 
			catch (ICException ee) 
			 {
				System.out.println("Card Blocked");
			 }
		 }
	  }
	
	}
}
public class CustomException 
{

	public static void main(String[] args)
	{
		Atm atm=new Atm();
		atm.iniate();

	}

}
