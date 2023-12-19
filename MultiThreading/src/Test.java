import java.sql.*;

public class Test 
{
   public static void main(String[] args) 
   {
//	   Runnable r=()->{
//		                  
//							for(int i=1;i<=5;i++)
//							  {
//								  System.out.println("Child Thread");
//							  }
//					   };
//		                  
//		   
//	      Thread t=new Thread(r);
//	      t.start();
	   new Thread(()->
	   {
		   for(int i=1;i<=5;i++)
				  {
					  System.out.println("Child Thread");
				  }
	   }).start();
		   
	   
	      
	   System.out.println("Main Thread");
		

	}

}
