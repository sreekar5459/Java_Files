class Sony
{
	void disp()
	{
		System.out.println("SONY HEADPHONES");
	}
	void disp(String color)
	{
		System.out.println(color);
	}
	void disp(int age)
	{
	    System.out.println(age);	
    }
}
public class Test2 {

	public static void main(String[] args)
	{
		Sony product=new Sony();
		product.disp();
		product.disp("Black");
		product.disp(2);

	}

}
