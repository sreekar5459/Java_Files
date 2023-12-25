interface car
{
	void carType();
	void model();
	
	default void color()
	{
		System.out.println("Amazon gray");
		screenType();
	}
	static void metal()
	{
		System.out.println("Carbon");
		lights();
	}
	private static void lights()
	{
		System.out.println("Red and Yellow");
	}
	private void screenType()
	{
		System.out.println("Samsung");
	}
}
class Hyundai implements car
{

	@Override
	public void carType() 
	{
		System.out.println("Hyundai Car");
		
	}

	@Override
	public void model() 
	{
		System.out.println("2023 model");
		
	}
//	public void color()
//	{
//		System.out.println("White colour");
//	}
	
}
public class LaunchInterface 
{

	public static void main(String[] args)
	{
		Hyundai h=new Hyundai();
		h.color();
		car.metal();
		

	}

}
