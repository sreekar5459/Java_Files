import java.util.Scanner;

public class ToUppercase 
{

	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+(char)(s1.charAt(i)-32);
		}
		System.out.println("First String: "+s1);
		System.out.println("Second String: "+s2);
	}
}


