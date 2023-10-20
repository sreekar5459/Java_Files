class Calculator3
{
	int a,b;
	
	
	int add()
	{
		a=5;
		b=20;
		return a+b;
	}
	
	
	
}
public class Method3 
{

	public static void main(String[] args)
	{
		Calculator3 calc =new Calculator3();
		int c=calc.add();
		System.out.println(c);

	}

}
