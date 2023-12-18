class Loan
{
	 void display()
	{
		System.out.println("    SBI LOAN APPLICATION    ");
	}
	
}
class PersonalLoan extends Loan
{
	  public void display()
	{
		System.out.println("Personal loan");
	}
}
class EducationLoan extends Loan
{
	
}
class HomeLoan extends Loan
{
	
}
class CarLoan extends Loan
{
	
}
public class LoanApplication {

	public static void main(String[] args) 
	{
		PersonalLoan pl=new PersonalLoan();
		pl.display();
		

	}

}
