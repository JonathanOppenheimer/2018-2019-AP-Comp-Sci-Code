import java.util.Scanner;

public class CollatzProblem 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number");
		int starter = kb.nextInt();
		System.out.print(starter + " ");
		
		while(starter>1)
		{
			if(starter%2==0)
			{
				starter = starter/2;
			}
			else
			{
				starter = ((starter*3)+1);
			}
			System.out.print(starter + " ");
		}
		kb.close();
	}
}
