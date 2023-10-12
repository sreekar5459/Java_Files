import java.util.Scanner;

public class CountryFarms {

	public static void main(String[] args)
	{
        String Username;
        String Password;
        
        Username="sree";
        Password="sri13";
        
        System.out.println("           WELCOME TO OUR WEBSITE COUNTRY HEN FARMS       ");
        
        Scanner input1=new Scanner(System.in);
        System.out.print("Username: ");
        String username=input1.next();
        
        Scanner input2=new Scanner(System.in);
        System.out.print("Password: ");
        String password=input2.next();
        
        if(username.equalsIgnoreCase(Username) && password.equals(Password))
        {
        	System.out.println(" Access Granted");
        }
        else if((username.equalsIgnoreCase(Username)))
        {
        	System.out.println("Invalid Password");
        }
        else if((password.equals(Password)))
        {
        	System.out.println("Invalid Username");
        }
        else
        {
        	System.out.println("Invalid Username & Password");
        }
       
        

	}

}
