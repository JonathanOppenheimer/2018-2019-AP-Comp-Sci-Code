import java.util.Arrays;
import java.util.Scanner;

public class LottoClassMain 
{
	public static void main(String[]args)
	{
		//setup
		int[]lottonumbers = new int[4];
		Scanner kb = new Scanner(System.in);
		LottoClass game = new LottoClass();
		//choosing whether they get auto numbers or choose their numbers
		System.out.println("Would you like to choose your lotto numbers? Yes or no.");
		String answer = kb.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			game.setNumbersPicking();
		}
		else if(answer.equalsIgnoreCase("no"))
		{
			game.setNumbersRandomly();
		}
		else
		{
			System.out.println("That's not an answer. Please leave.");
			System.exit(0);
		}
		//getting the lotto answers
		for(int i = 0; i<4; i++)
		{
			int temp = (int)(Math.random()*30+1);
			if(temp == lottonumbers[0] || temp ==  lottonumbers[1] 
			|| temp ==  lottonumbers[2] || temp ==  lottonumbers[3])
			{
				i--;
			}
			lottonumbers[i] = temp;
		}
		//sending correct answers to the class
		int a = lottonumbers[0];
		int b = lottonumbers[1];
		int c = lottonumbers[2];
		int d = lottonumbers[3];
		game.CheckNumbers(a, b, c, d);
		//checking the results against each other
		System.out.println("The lotto numbers were " + Arrays.toString(lottonumbers));
		game.CheckWinnings();
		//cleaning up the program
		kb.close();
	}
}
