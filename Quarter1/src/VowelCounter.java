import java.util.Scanner;

public class VowelCounter {
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String answer = "yes";
		int vowels = 0; 
		while(answer.equals("yes")) 
		{
			System.out.println("Enter in a word");
			String word = kb.next();
			int count = word.length()-1;
			while(count>=0) 
			{
				if(word.charAt(count) == 'a' || word.charAt(count) == 'e' || word.charAt(count) == 'i' || word.charAt(count) == 'o' || word.charAt(count) == 'u') 
				{
					vowels++;
				} 
					count--;
			}
			System.out.println("Your word has " + vowels + " vowels.");
			vowels = 0;
			System.out.println("Do you want to go again? Enter yes or no");
			answer = kb.next();
		}
		kb.close();
	}
}
