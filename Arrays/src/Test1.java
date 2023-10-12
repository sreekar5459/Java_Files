
public class Test1 
{

	public static void main(String [] args)
	{
		int [][] ar= {{10,40},{50,45},{40,60,30}};
		for(int [] a:ar)
		{
		for(int elem:a)
		{
			System.out.print(elem +" " );
		}
		System.out.println();
		}
	}
}
