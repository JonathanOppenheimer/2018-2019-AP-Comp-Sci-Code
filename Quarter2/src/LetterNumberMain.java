import java.util.Scanner;

public class LetterNumberMain 
{
	public static void main(String[]args)
	{
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter in a number or word");
		String temp = kb.next();
		//1 2 3 4 5 6
		//one two three four five or six
		LetterNumber objA = new LetterNumber();
		objA.letterOrWord(temp);
		objA.converToNum(temp);
		objA.converToString(temp);
	}
}
