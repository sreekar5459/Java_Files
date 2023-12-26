enum Oats
	{
		STRAWBERRY,BLUEBERRIES,MILK,QUAKER_OATS,NUT_POWDER;
	}
public class LaunchEnum1
{
	

	public static void main(String[] args)
	{
		Oats oat=Oats.STRAWBERRY;
		
		switch(oat) 
		{
		case STRAWBERRY:System.out.println("Strawberry in milk");
		break;
		case BLUEBERRIES:System.out.println("Added in milk");
		break;
		default:System.out.println("Nothing added");
		break;
	    }

    }
}
