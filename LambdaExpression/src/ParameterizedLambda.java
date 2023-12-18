@FunctionalInterface
interface Pl
{
	
	void add(int a,int b);
}

@FunctionalInterface
interface Pl1
{
	
	void sub(int x);
}


public class ParameterizedLambda {

	public static void main(String[] args)
	{
		//Two parameterized lambda
		// We can write in both ways
		Pl add=(int a,int b)->    //Pl add=( a, b)->
		{
		    int res=a+b;
		    System.out.println("The result for addition is :: " +res);
		};
		
		//One Parameterized Lambda
		Pl1 sub=(int x)->
		{
			int res=x-20;
			System.out.println("The result for Subtraction :: "+res);
		};
		add.add(10,20);
		sub.sub(40);
		

	}

}
