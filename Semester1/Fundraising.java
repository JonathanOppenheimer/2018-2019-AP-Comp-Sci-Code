import java.util.Scanner;

public class Fundraising 
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much do tickets cost?");
		int numOne = keyboard.nextInt();
		System.out.println("How many students bought tickets");
		int numTwo = keyboard.nextInt();
		System.out.println(numOne + " tickets sold" +  " * " + numTwo + " students buying tickets" + " = " + "$" + (numOne * numTwo) + " total raised");
		System.out.println("Time for the next set of questions. How many days of school did you attend?");
		int numThree = keyboard.nextInt();
		System.out.println(numThree + " days of school" + " / 7 days of the week" + " = " + (numThree/7) + " weeks of school and " + (numThree%7) + " days attended.");
		keyboard.close();
	}
}