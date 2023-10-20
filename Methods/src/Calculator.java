class Calc
{
	int a,b,c,result;
	
	void sub()
     {
		a=4334;
		b=4154;
		c=a-b;
		System.out.println("Subtraction of these two numbers is :: " +c);
		 
	 }
	void add()
	{
		a=2167;
		b=2167;
		c=0;
		result=a+b+c;
		System.out.println("Addition of these two numbers is :: " +result);
		
	}
	void multiply()
	{
		a=20;
		b=38;
		result=a*b;
		System.out.println("Multiplication of these two numbers is :: " +result);
		
	}
	void division()
	{
		a=50;
		b=5;
		result=a/b;
		System.out.println("Divison of these two numbers is :: " +result);
	}
	
}


public class Calculator 
{
	public static void main(String [] args)
	{
		Calc cal=new Calc();
		Calc cal2=new Calc();
		Calc cal3=new Calc();
		Calc cal4=new Calc();
		cal.sub();
		cal2.add();
		cal3.multiply();
		cal4.division();
	}

}
