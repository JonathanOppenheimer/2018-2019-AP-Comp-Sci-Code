import java.util.Scanner;

public class Inputing 
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter in your first name or killbots will be sent to your current location and you will be terminated");
		String name = keyboard.next() + ", Your answer is";
		name = name.toUpperCase();
		System.out.println("Please enter in a number");
		int numOne = keyboard.nextInt();
		System.out.println("Please enter in another number number");
		int numTwo = keyboard.nextInt();
		System.out.println(name + " " + numOne + " + " + numTwo + " = " + (numOne + numTwo));
		System.out.println(name + " " + numOne + " - " + numTwo + " = " + (numOne - numTwo));
		System.out.println(name + " " + numOne + " * " + numTwo + " = " + (numOne * numTwo));
		System.out.println(name + " " + numOne + " / " + numTwo + " = " + (numOne / numTwo));
		System.out.println(name + " " + numOne + " % " + numTwo + " = " + (numOne % numTwo));
		keyboard.close();
	}
}