public class MastermindMain 
{
	public static void main(String[]args)
	{
		int counter = 0;
		int check = 0;
		Mastermind objA = new Mastermind();
		System.out.println("This is mastermind. 8 rounds to find the correct 4 color code. There are 4 positions each occupied by either" + "\n"+ "the color Red, Green, Blue, Yellow, White, Black, or Brown. You most correctly guess the 4 colors in the correct order." + "\n" +  "Each color can only appear once Good luck!");
		objA.setup();
		while(check>=0)
		{
			objA.secondaryChecker(check);
			while(counter<=8)
			{
				objA.play(counter);
				objA.checkWin(counter);
				objA.printBoard();
				counter++;
			}
			if(counter==9)
			{
				check = 2;
			}
		}
		System.out.println("The game is over");
		if(check==1)
		{
			System.out.println("You won.");
		}
		if(check==2)
		{
			System.out.println("You lost.");
		}
	}
}
