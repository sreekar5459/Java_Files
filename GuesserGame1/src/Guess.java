import java.util.Scanner;

class Guesser
{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class Player1
{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Player-1 guess the number:: ");
		guessNum=scan.nextInt();
		return guessNum;
	}
	
}
class Player2
{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Player-2 guess the number:: ");
		guessNum=scan.nextInt();
		return guessNum;
	}
	
}
class Player3
{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Player-3 guess the number:: ");
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
	
	void collectFromGuesser()
	{
		Guesser g=new Guesser();
		numFromTheGuesser=g.guessNum();
	}
	void collectFromPlayers()
	{
		Player1 p1=new Player1();
		numFromThePlayer1=p1.guessNum();
		
		Player2 p2=new Player2();
		numFromThePlayer2=p2.guessNum();
		
		Player3 p3=new Player3();
		numFromThePlayer3=p3.guessNum();
		
	}
	void compare()
	{
		System.out.println("============================");
		if(numFromTheGuesser==numFromThePlayer1)
		{
			if(numFromTheGuesser==numFromThePlayer2 && numFromTheGuesser==numFromThePlayer3)
			{
				System.out.println("Game Tied");
			}
			else if(numFromTheGuesser==numFromThePlayer2)
			{
				System.out.println("1 &2 won the game");
			}
			else if(numFromTheGuesser==numFromThePlayer3)
			{
				System.out.println("1 &3 Won the game");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromTheGuesser==numFromThePlayer2)
		{
			if(numFromTheGuesser==numFromThePlayer2 && numFromTheGuesser==numFromThePlayer3)
			{
				System.out.println("2 & 3 won the game");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else
		{
			System.out.println("Player 3 won the game");
		}
	}
}
public class Guess 
{

	public static void main(String[] args) 
	{
		Empire e=new Empire();
		e.collectFromGuesser();
		e.collectFromPlayers();
		e.compare();

	}

}
