import java.util.Scanner;

public class RollingDiceMain 
{
	public static void main(String[]args)
	{
		int p1Wins = 0;
		int p2Wins = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("How many times would you like to play?");
		int times = kb.nextInt();	
		RollingDice player1 = new RollingDice();
		RollingDice player2 = new RollingDice();
		player1.setName(1);
		player2.setName(2);
		System.out.println("Welcome Player 1: " + player1.getName());
		System.out.println("Welcome Player 2: " + player2.getName());
		for(int i=0; i<times; i++)
		{
			player1.setRoll();
			player2.setRoll();
			if(player1.getRoll() > player2.getRoll())
			{
				p1Wins++;
			}
			else if(player1.getRoll()==player2.getRoll())
			{
				i--;
			}
			else if(player1.getRoll() < player2.getRoll())
			{
				p2Wins++;
			}
		}
		System.out.println("Player 1 won " + p1Wins + " times, and Player 2 won " + p2Wins + " times.");
		kb.close();
	}
}
