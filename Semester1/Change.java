import java.util.Scanner;

public class Change 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String agreement = "yes";
		while(agreement.equals("yes"))
		{
			System.out.println("Enter in the amount of money");
			double money = kb.nextDouble();
			System.out.println("You have " + ((int)(money/0.25)) + " quarters.");
			System.out.println("You have " + ((int)(money/0.10)) + " dimes.");
			System.out.println("You have " + ((int)(money/0.05)) + " nickles.");	
			System.out.println("You have " + ((int)(money/0.01)) + " pennies.");
			System.out.println("You have " + ((int)(money/1)) + " dollars.");
			System.out.println("Do you want to run it again?");
			agreement = kb.next();
			}
		kb.close();
	}
}
