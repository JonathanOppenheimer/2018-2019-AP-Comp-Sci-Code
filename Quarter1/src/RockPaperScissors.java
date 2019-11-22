import java.util.Scanner;

public class RockPaperScissors 
{
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Best of how many rounds? Choose an odd number."); 
		int rounds = kb.nextInt();
		String yeet = "yes";
		int cpuwins = 0;
		int wins = 0;
		while(yeet.equals("yes")) 
		{
			while(0<rounds)
			{
				
				System.out.println("Enter in R, S or P to choose your move.");
				String choice = kb.next();
				int cpuchoice = (int)(Math.random() * 3 + 1);
				String comp = "";
				System.out.print(comp);
				if(cpuchoice==1 && choice.equalsIgnoreCase("R")) {
					comp="rock";
					System.out.println("It's a tie");
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}
				else if(cpuchoice==1 && choice.equalsIgnoreCase("S")) {
					comp="rock";
					System.out.println("The computer wins");
					rounds--;
					cpuwins++;
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}
				else if(cpuchoice==1 && choice.equalsIgnoreCase("P")) {
					comp="rock";
					System.out.println("You win");
					rounds--;
					wins++;
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}
			
				else if(cpuchoice==2 && choice.equalsIgnoreCase("R")) {
					comp="paper";
					System.out.println("The computer wins");
					rounds--;
					cpuwins++;
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}
				else if(cpuchoice==2 && choice.equalsIgnoreCase("S")) {
					comp="paper";
					System.out.println("You win");
					rounds--;
					wins++;
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}
				else if(cpuchoice==2 && choice.equalsIgnoreCase("P")) {
					comp="paper";
					System.out.println("It's a tie");
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}
			
				else if(cpuchoice==3 && choice.equalsIgnoreCase("R")) {
					comp="scissors";
					System.out.println("You win");
					rounds--;
					wins++;
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}
				else if(cpuchoice==3 && choice.equalsIgnoreCase("S")) {
					comp="scissors";
					System.out.println("It's a tie");
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}
				else if(cpuchoice==3 && choice.equalsIgnoreCase("P")) {
					comp="scissors";
					System.out.println("The computer wins");
					rounds--;
					cpuwins++;
					System.out.println("The current score is " + wins + " to " + cpuwins + "");
					System.out.println("There are " + (rounds) + " rounds remaining.");
				}	
			}
			if(cpuwins>wins){
				System.out.println("I'm sorry you lost the game.");
			}
			else 
			{
				System.out.println("You won the game!");
			}
			cpuwins = 0;
			wins = 0;
			System.out.println("Do you want to go again? Enter yes or no");
			yeet = kb.next();
			System.out.println("Best of how many rounds? Choose an odd number."); 
			rounds = kb.nextInt();	
		}
		kb.close();
	}
}
/* person play the computer
 * computer is math.random 1-rock 2-scissor 3-paper
 * ask the person r,s,p*/

/* */