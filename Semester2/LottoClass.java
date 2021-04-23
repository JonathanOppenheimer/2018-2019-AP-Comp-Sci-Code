import java.util.Arrays;
import java.util.Scanner;

public class LottoClass 
{
	int[]mynumbers = new int[4];
	Scanner kb = new Scanner(System.in);
	int counter = 0;
	
	public void setNumbersRandomly()
	{
		for(int i = 0; i<4; i++)
		{
			int temp = (int)(Math.random()*30+1);
			if(temp == mynumbers[0] || temp ==  mynumbers[1] 
			|| temp ==  mynumbers[2] || temp ==  mynumbers[3])
			{
				i--;
			}
			mynumbers[i] = temp;
		}
	}
	public void setNumbersPicking()
	{
		int count = 1;
		for(int i =0; i<4; i++)
		{
			int temp = 0;
			System.out.println("Enter in number " + count + ". It can not be the same as a previous number and it must be a number from 1-30.");
			temp = kb.nextInt();
			if(temp == mynumbers[0] || temp ==  mynumbers[1] 
			|| temp == mynumbers[2] || temp ==  mynumbers[3] || temp>30)
			{
				System.out.println("You can't enter that number. Please try again.");
				if(i==0)
				{
					count--;
				}
				else
				{
					i--;
					count--;
				}
			}
			mynumbers[i] = temp;
			count++;
		}
	}
	public void CheckNumbers(int a, int b, int c, int d)
	{
		if(a == mynumbers[0] || a == mynumbers[1] || a == mynumbers[2] || a == mynumbers[3])
		{
			counter++;
		}
		if(b == mynumbers[0] || b == mynumbers[1] || b == mynumbers[2] || b == mynumbers[3])
		{
			counter++;
		}
		if(c == mynumbers[0] || c == mynumbers[1] || c == mynumbers[2] || c == mynumbers[3])
		{
			counter++;
		}
		if(c == mynumbers[0] || c == mynumbers[1] || c == mynumbers[2] || c == mynumbers[3])
		{
			counter++;
		}
	}
	public void CheckWinnings()
	{
		System.out.println("Your ticket was " +Arrays.toString(mynumbers));
		if(counter==4)
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("You did not win.");
		}
	}
}


