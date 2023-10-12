import java.util.*;
public class ThreeD_Jaggedarray 
{
  public static void main(String [] sreegs)
  {
	  Scanner scan =new Scanner(System.in);
	  int [][][] sree=new int[3][][];
	  sree[0]=new int[2][];
	  sree[1]=new int[3][];
	  sree[2]=new int[4][];
	  
	  sree[0][0]=new int[2];
	  sree[0][1]=new int[1];
	  sree[1][0]=new int[3];
	  sree[1][1]=new int[2];
	  sree[1][2]=new int[1];
	  sree[2][0]=new int[3];
	  sree[2][1]=new int[1];
	  sree[2][2]=new int[2];
	  sree[2][3]=new int[2];
	
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
