import java.util.Scanner;

public class RollingDice 
{	
	Scanner kb = new Scanner(System.in);
	String name;
	int roll;
	
	public void setName(int playernumber)
	{
		System.out.println("What is your name Player " + playernumber + "?");
		name = kb.next();
	}
	public String getName()
	{
		return name;
	}
	public void setRoll()
	{
		
		roll = (int)(Math.random()* 6 + 1);
	}
	public int getRoll()
	{
		return roll;
	}
}
