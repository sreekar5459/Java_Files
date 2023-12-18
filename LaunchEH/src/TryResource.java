import java.util.Scanner;

public class TryResource {

	public static void main(String[] args) 
	{
		try(Scanner scan=new Scanner(System.in))
		{
			System.out.println("Hello java lovers");
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
		finally
		{
			System.out.println("dg");
		}

	}

}
