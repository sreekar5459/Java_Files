class ThreadA extends Thread
{
	int total=0;
	
	@Override
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child thread started the calculation");
		
		        for(int i=1;i<=102;i++)
		         {
		           
			       total+=i;
		         }
		        System.out.println("Child Thread giving notification call");
		        this.notify();
		}
	}
	
}
public class WaitingState 
{

	public static void main(String[] args) throws Exception
	{
		ThreadA a=new ThreadA();
		a.start();
		
		
		synchronized(a)
		{
			System.out.println("main thread calling wait() method");
			a.wait();
			System.out.println("No of Threads::" +Thread.activeCount());
			System.out.println("main got the notification call");
			System.out.println("The sum of total is:: "+a.total);
		}

	}

}
