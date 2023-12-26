import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Annotations can used at
//	  1.interface
//	  2.class
//	  3.method
//	  4.fields(Instance Variables)
//	  5.local variables
//	  6.parameters
//	  7.constructors
//	  8.enums

//***********************************************************************

// When You create your own annotation you need to follow two steps
	// 1.Target 
	// 2.Retention policy

//***********************************************************************

//Two ways to assign the values one is inside the annotations like below example


//The second way is down below to assign the values just write the attributes but don't
//assign inside the annotations

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String name() default "ShikharDhawan";
	String country() default "India";


//	String name();
//	String country();
}
@CricketPlayer
//@CricketPlayer(name="ShikarDhawan",country="India")
class ShikharDhawan
{
	private String Team;
	private int Matches;
	
	
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		this.Team = team;
	}
	public int getMatches() {
		return Matches;
	}
	public void setMatches(int matches) {
		this.Matches = matches;
	}
	
	
}
public class LaunchAnn01
{

	public static void main(String[] args)
	{
		ShikharDhawan sd=new ShikharDhawan();
		sd.setMatches(167);
		sd.setTeam("India");
		
		System.out.println(sd.getTeam()+ " " +sd.getMatches());
		
//		Class c=sd.getClass();
//		Annotation an=c.getAnnotation(CricketPlayer.class);
//		CricketPlayer cp=(CricketPlayer) an;
//		String name=cp.name();
//		System.out.println(name);
//		String country=cp.country();
//		System.out.println(country);
		
		Class c=sd.getClass();
		Annotation ann=c.getAnnotation(CricketPlayer.class);
		CricketPlayer cpr= (CricketPlayer) ann;
		String country=cpr.country();
		String name=cpr.name();
		System.out.println(country+ " "+name);

	}

}
