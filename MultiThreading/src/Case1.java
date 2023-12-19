class Display
{
	public  synchronized void displayNumbers()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				//System.out.println("Uninterrupted Exception");
			}
		}
	}
	public  static synchronized void displayCharacters()
	{
		for(int i=65;i<=74;i++)
		{
			System.out.print((char)i);
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				//System.out.println("Uninterrupted Exception");
			}
		}
		
	}
}
class Mythread extends Thread
{
	Display d;

	 Mythread(Display d)
	{
	
		this.d = d;
	}
	
	
	@Override
	public void run()
	{
		d.displayNumbers();
	}
	
}
class Mythread1 extends Thread
{
	Display d;

	 Mythread1(Display d)
	{
	
		this.d = d;
	}
	
	
	@Override
	public void run()
	{
		d.displayCharacters();
	}
	
}
public class Case1 {

	public static void main(String[] args)
	{
		Display d1=new Display();
		Mythread mt=new Mythread(d1);
		Mythread1 mt1=new Mythread1(d1);
		mt.start();
		mt1.start();
		

	}

}
