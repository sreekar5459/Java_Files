class Paper extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child Thread");
				Thread.sleep(3000);
			}
			
		}
		catch(InterruptedException ie)
		{
			System.out.println("I am Interrupting");
		}
	}
}
public class MultiThreads 
{

	public static void main(String[] args) throws InterruptedException
	{
		Paper p=new Paper();
		p.start();
		
		
		for(int i=1;i<=6;i++)
		{
			System.out.println("Main Thread");
			
		}
		
		
		

	}

}
