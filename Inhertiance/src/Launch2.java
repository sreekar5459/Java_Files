class Ramaiah
{
	String name="Ramaiah";
	int age=72;
	
	void display()
	{
		System.out.println("Person details:  " +name+ " "+age );
	}
}

class Venkatesh extends Ramaiah
{
	
}

class Sreekar extends Venkatesh
{
	
}
public class Launch2 
{
	public static void main(String [] args)
	{
		Ramaiah d=new Ramaiah();
		d.display();
	}

}
