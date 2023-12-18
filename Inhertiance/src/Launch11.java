class Parent
{
	int a,b;
	Parent()
	{
	 a=10;
	 b=20;
	 System.out.println("PArent COnstructor");
	}
	Parent(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parent parameterised Constructor");
	}
}
class Child extends Parent
{
	int x,y;
	Child()
	{
		
		x=24;
		y=38;
		
	}
	Child(int x,int y)
	{
		super(x,y);
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		System.out.println("x:" +x);
		System.out.println("y:" +y);
	}
}
public class Launch11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		ch.display();
		System.out.println();
		Child ch1=new Child(1000,2000);
		ch1.display();

	}

}
