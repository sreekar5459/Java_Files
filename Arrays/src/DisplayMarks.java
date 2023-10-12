import java.util.*;
public class DisplayMarks 
{
	public static void main(String [] args)
	{
		Scanner scan= new Scanner(System.in);
		int [][] ar=new int[2][3];
		for(int i=0;i<ar.length;i++)
		{
			for (int j=0;j<ar[i].length;j++)
			{
				System.out.println("The marks of the class " +i+ " students" +j);
				ar[i][j]=scan.nextInt();
			}
		}
		System.out.println("Displaying the marks of all the classes and the students");
			
	    for(int i=0;i<ar.length;i++)
			{
				for (int j=0;j<ar[i].length;j++)
				{
					System.out.print(ar[i][j]+ " ");
					
				}
				System.out.println();
		    }
	}

}
