import java.util.*;
public class Launch3 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        int [][] ar=new int[2][3];
        for(int i=0;i<ar.length;i++)
        {
        	for(int j=0;j<ar[i].length;j++)
        	{
        		System.out.println("Enter the marks of the class: " + i + "  Students: " +j);
        		ar[i][j]=scan.nextInt();
        	}
        	
        }
        System.out.println("The marks of the students are: ");
    	for(int i=0;i<ar.length;i++)
    	{
    		for(int j=0;j<ar[i].length;j++)
    		{
    			System.out.print(ar[i][j] + " ");
    		}
    		System.out.println();
    		
	}

	}
}
