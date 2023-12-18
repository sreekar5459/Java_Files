class Testing
{
	int test=287;
	
}
class Tester extends Testing
{
	int test=288;
	public void display()
	{
		
		System.out.println( +super.test);
		
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t=new Tester();
		t.display();

	}

}
