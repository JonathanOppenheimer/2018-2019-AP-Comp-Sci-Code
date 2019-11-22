import java.util.Arrays;
import java.util.Scanner;

public class Seating 
{
	String [] chart;
	int[] checker = new int[10];
	int runner = 1;
			
	Scanner kb = new Scanner(System.in);
	//constructor 
	public Seating(int students)
	{
		chart = new String[students];
	}
	public void setSeat()
	{
		for(int i=0; i<10; i++)
		{
			String tempName = "";
			int tempSeat = 0;
			int runner = 1;
			System.out.println("What is your name?");
			tempName.equals(kb.next());
			while(runner == 1) 
			{
				System.out.println("From 1 to 10 what seat would you like?");
				tempSeat = kb.nextInt();
				if(checker[(tempSeat-1)] > -1)
				{
					chart[tempSeat-1].equals(tempName);
					checker[tempSeat-1] = -2;
					runner = 0;
				}
				else
				{
					System.out.println("That seat is taken");
				}
			}
		}
	}
	
	public void printer()
	{
		System.out.println(Arrays.toString(chart));
	}
}
