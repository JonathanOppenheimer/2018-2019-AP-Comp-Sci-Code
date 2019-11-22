import java.util.Scanner;

public class MineSweeper 
{
	Scanner kb = new Scanner(System.in);
	
	String[][]board;
	int tempX;
	int tempY;
	int spot1;
	int spot2;
	int counter = 0;
	int counter2 = 1;
	
	int pullWidth = 0;
	
	
	public void fillBoard(int width, int height) 
	{
		board = new String[width][height];
		spot1 = (int)Math.floor(Math.random() * width);
		spot2 = (int)Math.floor(Math.random() * height);
		pullWidth = width;
		System.out.println(spot1 + "" + spot2);
		for(int i=0; i<width; i++)
		{
			for(int k=0; k<height; k++)
			{
				board[i][k]=".";
				counter2++;
				/*if(i==spot1 && k==spot2)
				{
					System.out.println("bomb");
					System.out.println(i+" "+k);
					board[i][k]="*";
					board[i][k] = "?";
				}
				else
				{
					board[i][k] = "?";
				}*/
			}
		}
		tempX = width;
		tempY = height;	
	}
	public void printBoard()
	{
		for(int i=0; i<tempX; i++)
		{
			for(int k=0; k<tempY; k++)
			{
				System.out.print("[" + board[i][k] + "]");
			}
			System.out.println("");
		}
	}
	public void runBoard() 
	{
		System.out.println("Enter an X coordinate to open");
		int temp1 = kb.nextInt();
		System.out.println("Enter an Y coordinate to open");
		int temp2 = kb.nextInt();
		board[temp1][temp2] = "/";
		
		System.out.println(board[temp1][temp2]);
		if(board[temp1][temp2] == board[spot1][spot2+1] ||
		   board[temp1][temp2] == board[spot1][spot2-2] ||
		   board[temp1][temp2] == board[spot1+pullWidth][spot2] ||
		   board[temp1][temp2] == board[spot1-pullWidth][spot2])
		{
			board[temp1][temp2] = "?";
		}
		if(temp1 == spot1 && temp2 == spot2)
		{
			board[temp1][temp2] = "*";
		}
	}
	int checkBoard(int runner) 
	{
		
		if(board[spot1][spot2]==("*"))
		{
			System.out.println("You lost. You guessed " + counter + " correctly before losing.");
			runner=0;
		}
		else
		{
			System.out.println("You continue to live. +1 point");
			counter++;
		}
		return runner;
	}
}
