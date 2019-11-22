import java.util.Scanner;

public class SudakoLightDriver 
{
	public static void main(String[]args)
	{
		SudakoLight game1 = new SudakoLight();
		Scanner kb = new Scanner(System.in);
		int counter = 0;
		String answer = "";
		
		game1.advancedBoardFill();
		while(game1.checkBoard()==false)
		{
			System.out.println("Would you like to manually fill the board?");
			answer = kb.next();
			if(answer.equalsIgnoreCase("yes"))
			{
				game1.manualBoardFill();
			}
			else
			{
				game1.advancedBoardFill();
			}
			counter++;
		}
		System.out.println(game1);
		System.out.println("It took " + counter + " tries to solve.");
	}
}
