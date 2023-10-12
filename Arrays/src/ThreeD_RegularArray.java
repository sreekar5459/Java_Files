import java.util.Scanner;

public class ThreeD_RegularArray 
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int [][][] sree=new int[2][3][3];
	
	for(int i=0;i<sree.length;i++)
	{
		for(int j=0;j<sree[i].length;j++)
		{
			for(int k=0;k<sree[i][j].length;k++)
			{
				System.out.println("Marks of the college " +i + " class " +j + " Students " +k);
				sree[i][j][k]=scan.nextInt();
			}
		}
	}
	
	System.out.println("Displaying the marks of All the people");
	
	for(int i=0;i<sree.length;i++)
	{ 
		for(int j=0;j<sree[i].length;j++)
		{
			for(int k=0;k<sree[i][j].length;k++)
			{
				System.out.print(sree[i][j][k] + " ");
				
			}
		}
		System.out.println();
	}
	

}
}
