import java.util.Scanner;

public class StickGame 
{
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String answer = "yes";
		int sticks = 21;
		while(answer.equals("yes")) 
		{
			while(0<sticks)
			{
				System.out.println("P1: Number of sticks you want to pick up (1 or 2)");
				int choice = kb.nextInt();
				if(sticks == 1) {
					System.out.println("You can only pick up 1 stick.");
					sticks = sticks - 1;
					System.out.println("There are " + sticks + " remaining.");
				}
				else if(choice == 1) {
					sticks = sticks - 1;
					System.out.println("There are " + sticks + " remaining.");
				}
				else {
					sticks = sticks - 2;
					System.out.println("There are " + sticks + " remaining.");
				}
				if(sticks <= 0) {
					System.out.println("P2 wins");
					break;
				}
				
				//commands for player 2
				
				System.out.println("P2: Number of sticks you want to pick up (1 or 2)");
				choice = kb.nextInt();
				if(sticks == 1) {
					System.out.println("You can only pick up 1 stick.");
					sticks = sticks - 1;
					System.out.println("There are " + sticks + " remaining.");
				}
				else if(choice == 1) {
					sticks = sticks - 1;
					System.out.println("There are " + sticks + " remaining.");
				}
				else {
					sticks = sticks - 2;
					System.out.println("There are " + sticks + " remaining.");
				}
				if(sticks <= 0)  {
					System.out.println("P1 wins");
					break;
				}
			}
			sticks = 21;
			System.out.println("Do you want to go again? Enter yes or no");
			answer = kb.next();
		}
		System.out.println("Goodbye players.");
		kb.close();
	}
}
