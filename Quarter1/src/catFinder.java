import java.util.Scanner;

public class catFinder 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in a word");
		String word = kb.next();
		int count = word.length();
		for(int i=0; i<=count; i++) 
		{
			if(i+3>count) {
				System.out.println();
				break;
			}
			if(word.substring(i,i+3).equals("cat")){
				System.out.println("Letters " + (i+1) + " to " + (i+3) +  " contained the word cat");
			}
			else {
				System.out.println("Letters " + (i+1) + " to " + (i+3) +  " did not contain the word cat");
			}
		}
		
		kb.close();
	}
}
	
