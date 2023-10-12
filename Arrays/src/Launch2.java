import java.util.*;
public class Launch2 
{

	public static void main(String[] args) 
	{
	int[] ar=new int[3];//int n=ar.length;
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("Enter the marks of the students " +i);
		ar[i]=scan.nextInt();
	}
	System.out.print("Marks of the Students are as follow as: ");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i] +" ");
	}
    }

}
