import java.util.Scanner;

public class Marks
{

	public static void main(String[] args)
	{
		int num = 153;
		int temp=num,r,sum=0;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
		}
		if(temp==num)
		{
			System.out.println("Arm");
		}
		else
		{
			System.out.println("Not an Arm");
		}
	}

}
