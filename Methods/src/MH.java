class Parent
{
   public static void display()
   {
	   System.out.println("This is parent class");
   }
   
}
class Child1 extends Parent
{
	public static void display()
	{
		System.out.println("This is child class");
	}
}
public class MH {

	public static void main(String[] args)
	{
		Parent p=new Child1();
		p.display();
//		Child1 c=new Child1();
//		c.display();

	}

}
