import java.util.Scanner;

public class Mastermind 
{
	String[][]board = new String[8][5];
	String[] randomSet = new String[7];
	String[] answerBoard = new String[5];
	int temp = 0;
	int primaryCheck=0;

	//rows by columns
	public void setup()
	{
		//put round numbers in board
		for(int i=0; i<board.length; i++)
		{
			board[i][0] = Integer.toString(i+1);
		}
		//fill reference color board with the colors
		randomSet[0] = "Red"; 
		randomSet[1] = "Green"; 
		randomSet[2] = "Blue"; 
		randomSet[3] = "Yellow"; 
		randomSet[4] = "White"; 
		randomSet[5] = "Black"; 
		randomSet[6] = "Brown"; 	
		//fill answer Array with colors
		for(int i=0; i<4; i++)
		{	
			temp = (int)(Math.random() * 7);
			answerBoard[i]=randomSet[temp];
			
			if(answerBoard[i].equalsIgnoreCase(answerBoard[i+1]))
			{
				i--;
			}
		}
	}
	public void play(int counter)
	{
		Scanner kb = new Scanner(System.in);
		for(int k=1; k<board[0].length; k++)
		{
			System.out.println("Select color for slot #" + (k) + ".");
			board[counter][k]=kb.next();
		}
	}
	public void checkWin(int counter)
	{
		int temp = 0;
		int temp2 = 0;
		int temp3 = 0;

		//total win check
		for(int i=1; i<=4; i++)
		{
			if(board[counter][i].equalsIgnoreCase(answerBoard[0]))
			{
				temp++;
			}
		}
		if(temp==4)
		{
			primaryCheck = 1; 
		}

		//color and position
		for(int i=1; i<=4; i++)
		{
			if(board[counter][i].equalsIgnoreCase(answerBoard[0]))
			{
				temp2++;
			}
		}
		//right color
		for(int r=0; r<4; r++) 
		{
			for(int i=1; i<=4; i++)
			{
				if(board[counter][i].equalsIgnoreCase(answerBoard[r])) 
				{
					temp3++;
				}
			}
		}
		System.out.println("There were " + temp2 + " balls of the correct color in the correct position");
		System.out.println("There were " + temp3 + " balls of the correct color on the board");	
	}
	public int secondaryChecker(int check)
	{
		if(primaryCheck==1)
		{
			check=1;	
		}
		return check;
	}
	public void printBoard()
	{
		for(int rows = 0; rows<board.length; rows++)
		{
			for(int cols = 0; cols<board[0].length; cols++)
			{
				System.out.print(board[rows][cols]+ "\t");
			}
			System.out.println("");
		}
	}
}
