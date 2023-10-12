
public class launchmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {70,30,20};
		
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			
		}
		System.out.println("the max number is " +max);
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
			
		}
		System.out.println("the min number is "+min);

	}

}
