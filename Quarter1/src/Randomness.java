import java.util.Scanner;

public class Randomness 
{
	public static void main(String[]args)
	{
		System.out.println("Welcome to today's program!");
		System.out.println("Enter in your first name");
		Scanner kb = new Scanner(System.in);
		String name = kb.next();
		System.out.println("Welcome " + name + "!");
		System.out.println("Hold old are you?");
		int Age = kb.nextInt();
		System.out.println("You are roughly " + (Age/7) + " years old in dog years.");
		if(Age>20)
			System.out.println("Retire already you old fuck.");
		if(Age<20)
			System.out.println("Get to work you young fuck.");
		if(Age==100)
			System.out.println("How are you still alive..?");
		if(name.equals("Satan"))
			System.out.println("I'm your biggest fan by the way, " + name);
		else 
			System.out.println("Hey " + name + ", do you by chance know Satan?");
		System.out.println("______________________BREAK______________________");
		double decimal = 2.3345678;
		System.out.println(decimal);
		/* Between 0 and 1, not including 1. 
		 * (int) casting as an int */
		decimal = Math.random();
		System.out.println(decimal);
		decimal = (int)(Math.random()*10);
		System.out.println(decimal);
		decimal = (int)(Math.random()*100);
		System.out.println(decimal);
		decimal = (int)(Math.random()*1000);
		System.out.println(decimal);
		decimal = (int)(Math.random()*10000);
		System.out.println(decimal);
		System.out.println("______________________BREAK______________________");
		System.out.println("Enter in your first name");
		String name2 = kb.next();
		if(name2.equals("Ben"))
			System.out.println("Good luck at golf " + name);
		if(name2.equals("Nick"))
			System.out.println("Please shoot below 72  " + name);
		if(name2.equals("Ryan"))
			System.out.println("Kevin will help you " + name);
		decimal = (int)(Math.random()*(72));
		System.out.println("Jack shot a " + decimal);	
		kb.close();
	}
}