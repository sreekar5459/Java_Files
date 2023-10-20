class Calculator5
{
	int add(int a, int b)
	{
		return a+b;
	}
	float add(int a, float b)
	{
		return a+b;
	}
	float add(int a ,int b, float c)
	{
		return a+b+c;
	}
	double add(double a, double b, int c)
	{
		return a+b+c;
	}
}
public class TestMethodOverloading {

	public static void main(String[] args) 
	{
		Calculator5 cal=new Calculator5();
		int a=2, b=4,c=5;
		float m=5.0f,n=6.2f;
		double k=25.5,l=30.2;
		System.out.println(cal.add(a, b));
		System.out.println(cal.add(a, m));
		System.out.println(cal.add(a, b, n));
		System.out.println(cal.add(k, l, c));

	}

}
