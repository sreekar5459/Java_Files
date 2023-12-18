class Plane1
{
	public void fly()
	{
		System.out.println("Flying");
	}
	public void land()
	{
		System.out.println("landing");
	}
	public void takeOff()
	{
		System.out.println("Takeoff");
	}
	
}
class CargoPlane extends Plane1
{
	public void fly()
	{
		System.out.println("cargoplanes fly at lower height");
	}
	public void carryGoods()
	{
		System.out.println("Goods");
	}
}
class PassengerPlane extends Plane1
{
	public void fly()
	{
		System.out.println("passengerplanes fly at higher height");
	}
	public void carryPassengers()
	{
		System.out.println("Passengers");
	}
}
public class Plane {

	public static void main(String[] args)
	{
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		//1
		
		cp.fly();
		cp.land();
		cp.takeOff();
		cp.carryGoods();
		
		System.out.println();
		
        
        pp.fly();
        cp.land();
        pp.takeOff();
        pp.carryPassengers();
	}

}
