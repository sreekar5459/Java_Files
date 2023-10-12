import java.util.*;
public class TwoDimensionalArray 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
         int [][][] ar=new int[2][3][2];
         
        for(int i=0;i<ar.length;i++)
        {
        	for(int j=0;j<ar[i].length;j++)
        	{
        		for(int k=0;k<ar[i][j].length;k++)
        		{
        			System.out.println("Enter the marks of Colleges: " + i + " Classes: " + j + " Students: "+k );
        			ar[i][j][k]=scan.nextInt();
        		}
        	}
        }
        System.out.println("Marks Displayed Below As Follow As:");
        for(int i=0;i<ar.length;i++)
        {
        	for(int j=0;j<ar[i].length;j++)
        	{
        		for(int k=0;k<ar[i][j].length;k++)
        		{
        			System.out.print(ar[i][j][k]);
        			
        		}
        	}
        }
	}

}
