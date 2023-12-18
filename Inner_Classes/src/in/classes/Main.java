package in.classes;

class Outer
{
	public void show()
	{
		System.out.println("Testing OuterLoop");
	}
	class Inner
	{
		public void display()
		{
			System.out.println("Testing The Nested inner Loop");
		}
	}
}

public class Main {

	public static void main(String[] args) 
	{
		Outer s=new Outer();
		s.show();
		Outer.Inner dp=new Outer().new Inner();
		dp.display();

	}

}
