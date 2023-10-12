import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args)
	{
		int [] ar = {9,2,6,1,5,3,7,8,4};
		Scanner scan=new Scanner(System.in);
        System.out.println("Sort According to the order");
        int key=scan.nextInt();
        for(int i=0;i<ar.length;i++)
        {
        	for(int j=1;j<ar.length-i;j++)
        	{
        		if(ar[j]<ar[j-1])
        		{
        		   int tempVar=ar[j];
        		   ar[j]=ar[j-1];
        		   ar[j-1]=tempVar;
        		   
        		   
        		}
        	}
        }
        for(int elem:ar)
        {
        	System.out.println(elem+ " ");
        }
		

	}

}
