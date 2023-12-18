class Demo
{
	public void add(int... y)
	{
		// for each loop
		
		int total=0;
		for(int elem:y)
		{
			total+=elem;
			
		}
		System.out.println("The sum of is: "+total);
		
		// Normal for loop
		
//		int total=0;
//		for(int i=0;i<y.length;i++)
//		{
//			total+=y[i];
//		}
//		System.out.println("The sum is:"+total);
		
	}
}
public class VarArgs {

	public static void main(String[] args) 
	{
		Demo d=new Demo();
	
		d.add(10);
		d.add(10,20);
		
		

	}

}
