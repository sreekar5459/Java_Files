@FunctionalInterface
interface LOS
{
	int getLength(String str);
}

public class LS 
{

	public static void main(String[] args)
	{
		LOS l=(String str)->str.length();
		
        System.out.println(l.getLength("Sreekfdhgjjtwt4b6i769m87ygdsgar"));
	    

}
}

