import java.util.Scanner;

public class whileLooping 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String answer = "yes";
		System.out.println("Welcome to a game of Hangman. P1 will be entering in the word. P2 will be guessing. P2 has 4 guesses.");
		System.out.println("Please in a 4 letter word.");
		String word = kb.next();
		while(answer.equals("yes")) 
		{
			System.out.println("The current word is ****");
			char char1 = word.charAt(0);
			char char2 = word.charAt(1);
			char char3 = word.charAt(2);
			char char4 = word.charAt(3);
			
			
			{		//guess round 1
			System.out.println("#1 P2 please enter a letter.");
			char guess1 = kb.next().charAt(0);
			if(guess1 == char1) {
				System.out.println("Congrats you guessed a letter!");
				System.out.println("The current word is " + char1 + "***");
					//guess round 2
				System.out.println("#2 P2 please enter a letter.");
				char guess2 = kb.next().charAt(1);	
				if(guess2 == char2) {
					System.out.println("Congrats you guessed a letter!");
					System.out.println("The current word is " + char1 + char2 + "**");
					//guess round 3
					System.out.println("#3 P2 please enter a letter.");
					char guess3 = kb.next().charAt(2);
					if(guess3 == char3) {
						System.out.println("Congrats you guessed a letter!");
						System.out.println("The current word is " + char1 + char2 + char3 + "*");
						//guess round 4
						System.out.println("#4 P2 please enter a letter.");
						char guess4 = kb.next().charAt(3);
						if(guess4==char4) {
							System.out.println("Congrats you guessed a letter!");
							System.out.println("The current word is " + word);
							System.out.println("You won!");
						}
						else {
							System.out.println("You did not guess a letter");
							System.out.println("The current word is " + char1 + char2 + char3 + "*");
							System.out.println("You lost.");
						}
					}
					else if(guess3 == char4) {
						System.out.println("Congrats you guessed a letter!");
						System.out.println("The current word is " + char1 + char2 + "*" + char4);
						//guess round 4
						System.out.println("#4 P2 please enter a letter.");
						char guess4 = kb.next().charAt(3);
						if(guess4==char3) {
							System.out.println("Congrats you guessed a letter!");
							System.out.println("The current word is " + word);
							System.out.println("You won!");
						}
						else {
							System.out.println("You did not guess a letter");
							System.out.println("The current word is " + char1 + char2 + "*" + char4);
							System.out.println("You lost.");
						}
						
					}
					else {
						System.out.println("You did not guess a letter");
						System.out.println("The current word is " + char1 + char2 + "**");
						//guess round 4
						System.out.println("#4 P2 please enter a letter.");
					
						
					}
				}
				
				
				else if(guess2 == char3){
					System.out.println("Congrats you guessed a letter!");
					System.out.println("The current word is " + char1 + "*" + char3 + "**");
					System.out.println("#3 P2 please enter a letter.");
					char guess3 = kb.next().charAt(1);
					if(guess3 == char3) {}
					if(guess3 == char4) {}
					else {}
				}
				else if(guess2 == char4){
					System.out.println("Congrats you guessed a letter!");
					System.out.println("The current word is " + char1 + "**" + char4);
					System.out.println("#3 P2 please enter a letter.");
					char guess3 = kb.next().charAt(1);
					if(guess3 == char3) {}
					if(guess3 == char4) {}
					else {}
				}
				else {
					System.out.println("You did not guess a letter");
					System.out.println("The current word is " + char1 + "***");
					System.out.println("#3 P2 please enter a letter.");
					char guess3 = kb.next().charAt(1);
					if(guess3 == char3) {}
					if(guess3 == char4) {}
					else {}
				}
				
			
				
				
				
				
				
				
				
				
				
			}
			else if(guess1 == char2) {
				System.out.println("Congrats you guessed a letter!");
				System.out.println("The current word is *" + char2 + "**");

			}
			else if(guess1 == char2) {
				System.out.println("Congrats you guessed a letter!");
				System.out.println("The current word is **" + char3 + "*");

			}
			else if(guess1 == char2) {
				System.out.println("Congrats you guessed a letter!");
				System.out.println("The current word is ***" + char4);

			}
			else {
				System.out.println("You did not guess a letter");
				System.out.println("The current word is ****");
			}
			}
			
	
			
			System.out.println("Do you want to go again? Enter yes or no");
			answer = kb.next();
		}
		kb.close();
	}
}
