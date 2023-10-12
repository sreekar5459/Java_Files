import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{ 
	public static void main(String [] args)
	{
		String s1="the Morse Code";
		String s2="here comes dot";
		
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char [] ch1=s1.toCharArray();
		char [] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Its is anagram");
		}
		else
		{
			System.out.println("Its not a Anagram");
		}
		
		
	}

}
