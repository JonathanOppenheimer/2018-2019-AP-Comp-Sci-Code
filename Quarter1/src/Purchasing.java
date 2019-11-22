import java.util.Scanner;

public class Purchasing 
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int soccerBalls;
		int hockeyPucks;
		double amtSoccer;
		double amtHockey;
		System.out.println("How many soccer balls will you purchase?");
		soccerBalls = kb.nextInt();
		System.out.println("How many hockey pucks will you purchase?");
		hockeyPucks = kb.nextInt();
		System.out.println("How much do soccer balls cost?");
		amtSoccer = kb.nextInt();
		System.out.println("How much do hockey pucks cost");
		amtHockey = kb.nextInt();		
		System.out.println("What is your name?");
		String name = kb.next();
		if(name.equals("Ryan"))
			System.out.println("Your total is $" + (10 + (soccerBalls * amtSoccer) + (hockeyPucks * amtHockey)));
		else 
			System.out.println("Pick a number between 1 and 10");
			int luckyGuess = kb.nextInt();
			int guess = (int)(Math.random()*10+1);
				if(guess==luckyGuess)
					System.out.println("Your total is $0");
				else
					System.out.println("Your total is $" + (((soccerBalls * amtSoccer) + (hockeyPucks * amtHockey)) -10));
		kb.close();
	} 
}

