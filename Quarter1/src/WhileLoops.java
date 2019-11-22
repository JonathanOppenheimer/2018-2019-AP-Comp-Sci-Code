import java.util.Scanner;

public class WhileLoops {
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		int num = 30;
		while(num>0)
		{
			System.out.println(num);
			num--;	
		}
		System.out.println("Blast off!");
		String word = kb.next();
		/* ! is the symbol for the word not*/
		while(word.equals("golf"))
		{
			System.out.println("Enter in a word");
			word = kb.next();
		}
		/*compile error (problem with syntax) forget a ;
		 * logic error / runtime error / semantical error*/
		System.out.println("Enter in a number");
		int numb = kb.nextInt();
		while(numb == 7) 
		{
			 System.out.println("Enter in a number");
			 numb=kb.nextInt();
		}
		
		while(numb%5==0) 
		{
			System.out.println("Numb is a multiple of 5");
		}
		kb.close();
	}
}
