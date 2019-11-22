import java.util.Scanner;

public class forLoopingAgain 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		//program 1
		System.out.println("Enter in a first number.");
		int first = kb.nextInt();
		System.out.println("Enter in another number.");
		int second = kb.nextInt();
		for(int i=1; i<=second; i++)
		{
			if(first%i== 0) {
				System.out.println(i);	
			}
		}
		//program 2
		System.out.println("Round 2");
		System.out.println("Enter in a number");
		int num1 = kb.nextInt();
		System.out.println("Enter in a bigger number");
		int num2 = kb.nextInt();
		System.out.print("   ");
		for(int i=1; i<=num1; i++){
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=1; i<=num1; i++){
			System.out.print(num2*i + " ");
		}
		//program 3
		System.out.println("Round 3");
		System.out.println("Enter in a word");
		String word = kb.next();
		int count = word.length();
		for(int i=1; i<=count; i++) {
			System.out.println(word.substring(0, i));
		}
		for(int i=count; i>=0; i--) {
			System.out.println(word.substring(i, count));
		}
		kb.close();
	}
}

