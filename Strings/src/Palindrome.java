import java.util.Scanner;

public class Palindrome
{
	public static void main(String [] args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.print("Enter the String to check whether is palindrome or not: ");
	 String s1=scan.nextLine();
	 String s2="";
	 for(int i=s1.length()-1;i>=0;i--)
	 {
		 s2=s2+s1.charAt(i);
	 }
	 if(s1.equals(s2))
	 {
		 System.out.println("The String is palindrome");
	 }
	 else
	 {
		 System.out.println("The String is not palindrome");
	 }
	}

}
