
public class Catch 
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("Print the valves");
			try
			{
				System.out.println("Continuing to print ");
				
			}
			catch(Exception ae)
			{
				System.out.println("Error in try block");
			}
			finally
			{
				System.out.println("Finally in try block");
				System.out.println("-------------------------------");
			}
		}
		catch(Exception a)
		{
			try
			{
				System.out.println("Continuingvngngf to print ");
				System.out.println(10/0);
			}
			catch(Exception ae)
			{
				System.out.println("Error in Catch block");
			}
			finally
			{
				System.out.println("Finally in catch block");
				System.out.println(" -------------------------------");
			}
			
		}
		finally
		{
			try
			{
				System.out.println("Continuing   print ");
				System.out.println(10/0);
			}
			catch(Exception a)
			{
				System.out.println("Error in Finally block");
			}
			finally
			{
				System.out.println("Finally in finaly block");
			}
			
		}
		
	}

}
