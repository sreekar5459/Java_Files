@FunctionalInterface
interface Demo2
{
	void add();
}


public class LamdaExpression {

	public static void main(String[] args)
	{
		Demo2 d=()->
		{
			System.out.println("Lamda");
		};
		d.add();
	}

}
