interface  Go
{
	public void go();
	

}
class Sente implements Go
{
	public void go()
	{
		System.out.println("go in Sente");
	}
}
class Goban extends Sente
{
	public void go()
	{
		System.out.println("go in Goban");
	}
}
class Stone extends Goban implements Go
{
	
}
public class GoTest {

	public static void main(String[] args) {
		Sente s=new Sente();
		s.go();
		Goban g=new Goban();
		g.go();
		Stone c=new Stone();
		c.go();

	}

}
