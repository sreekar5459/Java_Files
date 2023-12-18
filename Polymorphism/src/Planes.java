class Plane
{
	public void runway()
	{
		System.out.println("Plane is on the Runway");
	}
	public void land()
	{
		System.out.println("plane is about to land");
	}
	public void takeOff()
	{
		System.out.println("plane is about to takeoff");
	}
	public void fuelLoading()
	{
		System.out.println("Fuel Loading in jet planes");
	}
}
class FighterPlane extends Plane
{
	public void fuelLoading()
	{
		System.out.println("Fuel Loading in jet planes");
	}
}
class CommercialPlane extends Plane
{
	public void fuelLoading()
	{
		System.out.println("Fuel Loading in jet planes");
	}
}
class PassengerPlane extends Plane
{
	public void fuelLoading()
	{
		System.out.println("Fuel Loading in jet planes");
	}
}
class Airport
{
	public void permit(Plane ref)
	{
		ref.fuelLoading();
		ref.land();
		ref.takeOff();
		ref.runway();
	}
}

public class Planes 
{
	public static void main(String [] args)
	{
		Plane fp=new FighterPlane();
		Plane cp=new CommercialPlane();
		Plane pp=new PassengerPlane();
		Airport ap=new Airport();
		ap.permit(fp);
		System.out.println();
		ap.permit(cp);
		System.out.println();
        ap.permit(pp);		
	}

}
