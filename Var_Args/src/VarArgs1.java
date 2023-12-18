class Test
{
	
	public void subtract(int... a)
	{
		int total=100;
		for(int elem:a)
		{
			total-=elem;//total=total-elem;
		}
		System.out.println("The subtraction is::" +total);
	}
}
public class VarArgs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		t1.subtract(0);
		t1.subtract(20,4);
		t1.subtract(668,120);

	}

}
