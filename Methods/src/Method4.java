class Cal4
{
	
	int add(int a, int b)
	{
		return a+b;
	}
}
public class Method4 {

	public static void main(String[] args) {
		Cal4 calc=new Cal4();
		int res=calc.add(5, 6);
		System.out.println(res);
	}

}
