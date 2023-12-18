class MyThreads extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			
			System.out.println("Child Thread");
			
		}
	}
}
public class ThreadsTest1 {

	public static void main(String[] args) throws InterruptedException 
	{
		MyThreads mt=new MyThreads();
		mt.start();
		
		for(int i=1;i<=5;i++)
		{
			
			System.out.println("Parent  Thread");
			
		}
		
				

	}

}
