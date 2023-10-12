import java.util.Scanner;

public class StudentMark 
{
	public static void main(String [] args)
	{
		int [] ar=new int [4];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Store the marks of all the 4 students " +i);
			ar[i]=scan.nextInt();
		}
		System.out.println("Displayed marks of all the Students ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i] + " ");
		}
	}

	
}
