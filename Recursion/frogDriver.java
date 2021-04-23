import java.util.Scanner;

public class frogDriver 
{
	public static void main(String[]arg)
	{
		Scanner kb = new Scanner(System.in);
		String answer = "yes"; 
		
		frog frog1 = new frog(30,5);
		
		while(answer.equals("yes"))
		{
			frog1.hopDistance();
			frog1.booleanSimulator();
			frog1.doubleFunSimulator();
			frog1.printOut();
			frog1.reset();
			System.out.println("Would you like to go again?");
			answer = kb.next();
		}
	}
}
