import java.util.Scanner;

abstract class Shape
{
	float area;
	abstract public void input();
	abstract public void compute();
	abstract public void display();
	
}
class Rectangle extends Shape
{
	float length;
	float breadth;
	
	@Override
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length=scan.nextFloat();
		System.out.println("enter the breadth of the Rectangle");
		breadth=scan.nextFloat();		
	}
	@Override
	public void compute() {
		area=length*breadth;
		
	}
	@Override
	public void display() {
		System.out.println("Area of rectangle is: " +area);
		
	}
	
}
class Square extends Shape
{
	float length;

	@Override
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Square");
		length=scan.nextFloat();
		
	}

	@Override
	public void compute() {
		area=length*length;
		
	}

	@Override
	public void display() {
		System.out.println("Area of Square is: " +area);
		
	}
	
}
class Circle extends Shape
{
	float radius;
	final float pi=3.14f;
	@Override
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		radius=scan.nextFloat();
		
	}
	@Override
	public void compute() {
		area=pi*radius*radius;
		
	}
	@Override
	public void display() {
		System.out.println("Area of Circle is: "+area);
		
	}
	
}
class Geometry
{
	public void permit(Shape s)
	{
		s.input();
		s.compute();
		s.display();
	}
	
}
public class Shapes {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();
		Square ss=new Square();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.permit(r);
		System.out.println("------------------------------------------");
		g.permit(ss);
		System.out.println("------------------------------------------");
		g.permit(c);
		System.out.println("------------------------------------------");

	}

}
