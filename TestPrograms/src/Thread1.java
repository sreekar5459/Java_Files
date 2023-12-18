class MyThread extends Thread 
{
	public void run()
	{
		Thread.currentThread().setName("Sreekar");
		System.out.println("user defined Thread ::"+Thread.currentThread().getName());
	}
	
}
public class Thread1 {

	public static void main(String[] args) 
	{
		String name=Thread.currentThread().getName();
		System.out.println("main() is executed by:: "+name);
		System.out.println();
		
		MyThread t=new MyThread();
		t.start();
		
		Thread.currentThread().setName("Arunamma");
		System.out.println("Main() thread name Change::"+Thread.currentThread().getName());
		System.out.println();
		
	}

}
