import java.util.Scanner;

public class EvenNumberMain 
{
	public static void main(String[]args)
	{
		EvenNumber objectA = new EvenNumber();	
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = kb.nextInt();
		objectA.isEven(number);
	}
}
