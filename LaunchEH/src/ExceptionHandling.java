import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args)
	{
		System.out.println("Connection is established for Calculator");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the 1st no:");
		int x=scan.nextInt();
		System.out.print("Enter the 2nd no:");
		int y=scan.nextInt();
		
		int result=x/y;
		System.out.println("The result is ::"+result);
		System.out.println("The connection is terminated");
	}

}
