import java.util.Scanner;

public class TicTacToe 
{
	Scanner kb = new Scanner(System.in);
	String[][] board = new String[3][3];
	String symbol = "";
	
	public void clearer()
	{
		for(int i=0; i<board.length; i++)
		{
			for(int k=0; k<board.length; k++)
			{
				board[i][k] = " ";
			}
		}
	}
	public void fillBoard()
	{
		System.out.println("What symbol are you?");
		symbol = kb.next();
		
		for(int i=0; i<1; i++)
		{
			int runner=1;
			int temp = 0;
			
			while(runner==1)
			{
				System.out.println("What row would you like to fill");
				temp = kb.nextInt();
				System.out.println(temp);
				if((temp == 0 || temp == 1) || temp == 2)
				{
					runner=0;
				}
				else
				{
					System.out.println("That position isn't valid");
				}
			}
			int row = temp;
			runner = 1;
			while(runner==1)
			{
				System.out.println("What column would you like to fill");
				temp = kb.nextInt();
				System.out.println(temp);
				if((temp == 0 || temp == 1) || temp == 2)
				{
					runner=0;
				}
				else
				{
					System.out.println("That position isn't valid");
				}
			}
			int column = temp;
			
			if(board[row][column] != " ")
			{
				System.out.println("That space is already filled. Select a different spot.");
				i--;
			}
			else
			{
				board[row][column] = symbol;
			}
		}
	}
	public void printBoard()
	{
		for(int i=0; i<board.length; i++)
		{
			for(int k=0; k<board.length; k++)
			{
				System.out.print("[" + board[i][k] + "]");
			}
			System.out.println("");
		}
	}
	int checkBoard(int runner, String checker)
	{
		for(int i=0; i<3; i++)
		{
			if(board[i][0].equalsIgnoreCase(checker) && board[i][1].equalsIgnoreCase(checker) && board[i][2].equalsIgnoreCase(checker))
			{
				runner = 0;
				System.out.println(symbol + " won!");
				System.exit(0);
			}
		}
		for(int i=0; i<3; i++)
		{
			if(board[0][i].equalsIgnoreCase(checker) && board[1][i].equalsIgnoreCase(checker) && board[2][i].equalsIgnoreCase(checker))
			{
				runner = 0;
				System.out.println(symbol + " won!");
				System.exit(0);
			}
		}
		for(int i=0; i<3; i++)
		{
			if(board[0][0].equalsIgnoreCase(checker) && board[1][1].equalsIgnoreCase(checker) && board[2][2].equalsIgnoreCase(checker))
			{
				runner = 0;
				System.out.println(symbol + " won!");
				System.exit(0);
			}
		}
		for(int i=0; i<3; i++)
		{
			if(board[0][2].equalsIgnoreCase(checker) && board[1][1].equalsIgnoreCase(checker) && board[2][0].equalsIgnoreCase(checker))
			{
				runner = 0;
				System.out.println(symbol + " won!");
				System.exit(0);
			}
		}
		return runner;
	}
}
