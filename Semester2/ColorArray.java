import java.util.Scanner;

public class ColorArray 
{
	public static void main(String[]args)
	{
		int red=0;
		int blue=0;
		Scanner kb = new Scanner(System.in);
		System.out.println("How many inputs would you like to input?");
		int inputs = kb.nextInt();
		String [] colors = new String[inputs];
		for(int i=0; i<inputs; i++)
		{
			System.out.println("Enter in a color");
			String choice = kb.next();
			colors[i]= choice;
		}
		for(int i=0; i<inputs; i++)
		{
			
			if(colors[i].equalsIgnoreCase("blue"))
			{
				blue++;
			}
			if(colors[i].equalsIgnoreCase("red"))
			{
				red++;
			}
		}
		System.out.println("The array had " + blue + " blue entries and " + red + " red entries.");
		kb.close();
	}
}
