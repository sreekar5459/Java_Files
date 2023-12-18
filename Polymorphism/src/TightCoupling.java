class Hyundai
{
	public void car()
	{
		System.out.println("Hyundai Cars");
	}
}
class Tucson extends Hyundai
{
	public void car()
	{
		System.out.println("Tucson 2023 model");
	}
}
class SantaFe extends Hyundai
{
	public void car()
	{
		System.out.println("SantaFe 2023 model");
	}
}

public class TightCoupling
{

	public static void main(String[] args) 
	{
		Hyundai company=new Hyundai();
		Tucson t=new Tucson();
		SantaFe s=new SantaFe();
		
		Hyundai ref;
		ref=t;
		ref.car();
		
		ref=s;
		ref.car();
		

	}

}
