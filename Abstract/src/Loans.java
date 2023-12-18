abstract class Loan
{
	 public abstract void displayInterest();
	
	public void welcome()
	{
		System.out.println("Welcome to BOFA");
	}
	
}
class carLoan extends Loan
{

	@Override
	public void displayInterest() 
	{
		System.out.println("ROI of Car Loan is :: 4.99%");
		
	}
	
}
class homeLoan extends Loan
{

	@Override
	public void displayInterest()
	{
		System.out.println("ROI of Home LOanis :: 8.49%");
		
	}
	
}
public class Loans {

	public static void main(String[] args) 
	{
		Loan loan=new carLoan();
		loan.welcome();
		loan.displayInterest();
		System.out.println();
		Loan loan1=new homeLoan();
		loan1.welcome();
		loan1.displayInterest();

	}

}
