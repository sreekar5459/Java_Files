class Interest
{
	
}
class InterestPersonalLoans extends Interest
{
	
}
class Loans
{
	public Interest interest()
	{
		Interest i=new Interest();
		return i;
	}
}
class PersonalLoans extends Loans
{
	public InterestPersonalLoans personalLoans()
	{
		InterestPersonalLoans ipl=new InterestPersonalLoans();
		return ipl;
	}
}
public class Co_Varient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
