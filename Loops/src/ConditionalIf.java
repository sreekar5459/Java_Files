
public class ConditionalIf
{
	public static void main(String [] args)
	{
		int a=10,b=2,c=3;
		int result=(a>b)?(a>c ? a:c):(b>c? b:c);
		System.out.println("The greatest number is : " +result);
	}
}
