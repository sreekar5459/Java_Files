
public class Panagram
{
   public static void main(String [] args)
   {
	   boolean flag=false;
	   String s1="The Quick Brown Fox Jumps Over Lazy Dog";
	   s1=s1.replace(" ", "");
	   
	   char [] ch=s1.toCharArray();
	   
	   int [] arr=new int[26];
	   for(int i=0;i<ch.length;i++)
	   {
		   int index=ch[i]-65;
		   arr[index]++;
	   }
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]==0)
		   {
			   System.out.println("Its not a panagram");
			    flag=true;
		   }
		   
	   }
	   if(flag==false)
	   {
		   System.out.println("Its is Panagram");
	   }
   }
	
}
