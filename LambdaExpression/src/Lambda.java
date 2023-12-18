@FunctionalInterface
interface Calculator
{
	void add();
}
public class Lambda {

	public static void main(String[] args) 
	{
		Calculator calc= ()->
		{
			int a=10;
			int b=2;
			int res=a+b;
			System.out.println("The Sum is :: "+res );
		};
		calc.add();

	}

}
