class DT extends Thread
{
	
}
public class Daemonthread {

	public static void main(String[] args)
	{
		// TODO Daemon thread: A thread which is executing in the background is called Daemon Thread
		
		DT dt=new DT();
		dt.setDaemon(true);
	    dt.start();
		
		System.out.println("Main Thread ::"+Thread.currentThread().isDaemon());
		System.out.println("This Thread is Daemon::"+dt.isDaemon());

	}

}
