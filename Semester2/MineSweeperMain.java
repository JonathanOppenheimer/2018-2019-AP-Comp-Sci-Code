import java.util.Scanner;

public class MineSweeperMain 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int runner = 1;
		MineSweeper objA = new MineSweeper();
		
		System.out.println("How wide do you want your board?");
		int width = kb.nextInt();
		System.out.println("How long do you want your board?");
		int height = kb.nextInt();
		
		objA.fillBoard(width, height);
		objA.printBoard();
		while(runner == 1)
		{
			objA.runBoard();
			runner = objA.checkBoard(runner);
			objA.printBoard();
		}
	}
}
