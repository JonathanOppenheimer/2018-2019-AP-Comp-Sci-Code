import java.util.Scanner;

public class SudakoLight 
{
	//variables
	Scanner kb = new Scanner(System.in);
	private int[][]board = new int[3][3];

	//methods

	public void manualBoardFill()
	{
		for(int row=0; row<3; row++)
		{
			for(int column=0; column<3; column++)
			{
				System.out.println("Please enter in the value for row " + (row+1) + " and column " + column + ".");
				board[row][column] = kb.nextInt();
			}
		}
	}

	public void advancedBoardFill()
	{
		for(int row=0; row<3; row++)
		{
			for(int column=0; column<3; column++)
			{
				board[row][column] = (int)(Math.random()*9 + 1);	
			}
		}
	}

	public boolean checkBoard()
	{
		int check = board[0][0] +  board[0][1] +  board[0][2];
		int check1 = board[1][0] +  board[1][1] +  board[1][2];
		int check2 = board[2][0] +  board[2][1] +  board[2][2];
		if(check!=check1 || check1 != check2)
		{
			System.out.println("That was not a valid solution.");
			return false;
		}

		int check3 = board[0][0] +  board[1][0] +  board[2][0];
		int check4 = board[0][1] +  board[1][1] +  board[2][1];
		int check5 = board[0][2] +  board[1][2] +  board[2][2];
		if(check3!=check4 || check4 != check5)
		{
			System.out.println("That was not a valid solution.");
			return false;
		}
		System.out.println("That was a valid solution.");
		return true; 
	}

	public String toString()
	{
		String boardString="";
		for(int row=0; row<3; row++)
		{
			for(int column=0; column<3; column++)
			{
				boardString = boardString + (board[row][column] + "\t");
			}
			boardString = boardString + "\n";
		}
		return boardString;
	}
}
