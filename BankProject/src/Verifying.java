import java.util.Scanner;

class Bank
{
	int userid=750613;
	int pin=5459;
	int user;
	int pw;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the userid: ");
		user=scan.nextInt();
		System.out.print("Enter the pin: ");
		pw=scan.nextInt();
		
		if((userid==user)&&(pin==pw))
		{
			System.out.println("Take cash Verified");
		}
		else
		{
			
			System.out.println("Card Blocked");
		}
	}
}
public class Verifying {

	public static void main(String[] args)
	{
		Bank b=new Bank();
		b.input();

	}

}
