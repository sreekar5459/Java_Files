enum Phone
{
	IPHONE,BLACKBERRY,ANDRIOD;
	
	int pieces;

	public int getPieces()
	{
		return pieces;
	}

	public void setPieces(int pieces) 
	{
		this.pieces = pieces;
	}
	
	
}
public class LaunchEnum3 {

	public static void main(String[] args)
	{
		Phone.BLACKBERRY.setPieces(9);
		Phone.ANDRIOD.setPieces(750);
		Phone.IPHONE.setPieces(240);
		int stock3=Phone.BLACKBERRY.getPieces();
		int stock1=Phone.ANDRIOD.getPieces();
		int stock2=Phone.IPHONE.getPieces();
		System.out.println("BLACK_BERRY :: "+stock3);
		System.out.println("ANDRIOD :: "+stock1);
		System.out.println("IPHONE :: "+stock2);
		
		

	}

}
