package methods;

class Addition
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(int a,float b)
	{
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
}

public class Methods {
	

	public static void main(String[] args) {
		int a=10,b=20;
		float x=22.3f,y=10.7f;
		Addition calc=new Addition();
		System.out.println(calc.add(a, b));
		System.out.println(calc.add(a, y));
		System.out.println(calc.add(x, y));
		
		

	}

}

