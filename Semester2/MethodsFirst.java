
import java.util.Scanner;

public class MethodsFirst 
{
	public static void main(String[]args) 
	{	
		for(int i=1; i<=10; i=i+3) 
		{
			kill();
			int x = killAgain();
			System.out.println("Hugged " + x);
		}
	}
	
	public static void kill() 
	{	
		System.out.println("Don't kill");
	}
	
	public static int killAgain() 
	{
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in) ;
		System.out.println("How many animals have you killed?");
		int animals = kb.nextInt();
		return animals; 
	}
}
