class Person1
{
  String name="Sreekar";
  int age=27;
  
  void display()
  {
	  System.out.println("Display details: " +name+ " " +age);
  }
}

class Person2 extends Person1
{
	
}

public class Launch1 {

	public static void main(String[] args) {
		// using  a concept of Inhertiance by using EXTENDS to a different class
		Person2 p1=new Person2();
		p1.display();
		

	}

}
