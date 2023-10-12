import java.util.Scanner;

public class StudentMarks
{
	public static void main(String [] args)
	{
		int [] ar=new int[5];
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Store the marks of the Students " +i);
			ar[i]=scan.nextInt();
		}
		System.out.println("Marks of the Students as follow as");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
