import java.util.Scanner;

public class ToLowerCase 
{

	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The String to Lower case");
		String s1=scan.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+(char)(s1.charAt(i)+32);
		}
		System.out.println("The Original String is :" +s1);
		System.out.println("The lower case String is :" +s2);
	}
}
