package calculator;



class calc
{
	int num1=20;
  	int num2=10;
   	int result;
	
	public void add()
	{
		result=num1+num2;
		System.out.println("Addition:: "+result);
	}
	public void sub()
	{
		result=num1-num2;
		System.out.println("Subtrction:: "+result);
	}
	public void  multiply()
	{
		result=num1*num2;
		System.out.println("Multiplication:: "+result);
	}
	public void divide()
	{
		result=num1%num2;
		System.out.println("Division:: "+result);
	}
 
	
}
public class Calculator
{

	public static void main(String[] args)
	{
		calc c=new calc();
		c.add();c.sub();c.multiply();c.divide();

	}

}
