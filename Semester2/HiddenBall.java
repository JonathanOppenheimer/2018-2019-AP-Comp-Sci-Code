import java.util.Scanner;

public class HiddenBall 
{
	Scanner kb = new Scanner(System.in);
	String [] cups;
	int money = 1000;
	int guess;
	int gamble;
	int tempSpot;
	
	public HiddenBall(int size)
	{
		cups = new String[size];
	}
	public String toString()
	{
		String position="";
		
		for(int i = 0; i<cups.length; i++)
		{
			position=i+1 + ": " + cups[i] + " " + position;
		}
		return position;
	}
	public void setHiddenBall()
	{
		int spot = (int)(Math.random()*cups.length);
		cups[spot] = "Ball";
		tempSpot = spot;
	}
	public void setGame()
	{
		int runner = 1;
		while(runner > 0)
		{
			System.out.println("How much would you like to gamble? You have " + money + " dollars remaining.");
			gamble = kb.nextInt();
			if(gamble>money)
			{
				System.out.println("You can't gamble more then you have.");
			}
			else
			{
				runner = -1;
			}
		}
		System.out.println("Choose a cup number, 1-4");
		guess = kb.nextInt();
	}
	public void Account()
	{
		if(gamble == tempSpot+1)
		{
			System.out.println("You won!");
			money = money + gamble;
			
		}
		else
		{
			System.out.println("You lost!");
			money = money - gamble;	
		}
	}
	public int getAccount()
	{
		cups[tempSpot] = "null";
		return money;
	}
}

