import java.util.Scanner;

class Guesser
{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser Kindly the guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Players
{
	int guessNum;
	int guessNum()
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Player guess the number");
	  guessNum=scan.nextInt();
	  return guessNum;
	}
}

class Empire
{
	int numFromTheGuesser;
	int numFromThePlayer1;
	int numFromThePlayer2;
	int numFromThePlayer3;
	
	void collectFromTheGuesser()
	{
		Guesser g=new Guesser();
		numFromTheGuesser=g.guessNum();
		
	}
	void collectFromThePlayers()
	{
	  	Players p1=new Players();
	  	Players p2=new Players();
	  	Players p3=new Players();
	  	numFromThePlayer1=p1.guessNum();
	  	numFromThePlayer2=p2.guessNum();
	  	numFromThePlayer3=p3.guessNum();
	}
	void compare()
	{
	 if(numFromTheGuesser==numFromThePlayer1)
	 {
		 if(numFromTheGuesser==numFromThePlayer2 && numFromTheGuesser==numFromThePlayer3)
		 {
			 System.out.println("Tied Between all the players");
		 }
		 else if(numFromTheGuesser==numFromThePlayer2)
		 {
			 System.out.println(" 1 and 2 Players won the game");
		 }
		 else if(numFromTheGuesser==numFromThePlayer3)
		 {
			 System.out.println("1 and 3 players won the game");
		 }
		 else 
		 {
		 System.out.println("Player 1 won the game");
		 }
	 }
	 else if (numFromTheGuesser==numFromThePlayer2)
	 {
		 if(numFromTheGuesser==numFromThePlayer2 && numFromTheGuesser==numFromThePlayer3)
		 {
			 System.out.println(" 2 and 3 Players won the game");
		 }
		 else
		 {
		 System.out.println("Player 2 won the game");
		 }
	 }
	 else if(numFromTheGuesser==numFromThePlayer3)
	 {
		 System.out.println("Player 3 won the game");
	 }
	 else
	 {
		 System.out.println("Game lost Try Again !!");
	 }
	}
}
public class GuesserGame {

	public static void main(String[] args)
	{
		Empire emp=new Empire();
		emp.collectFromTheGuesser();
		emp.collectFromThePlayers();
		emp.compare();

	}

}
