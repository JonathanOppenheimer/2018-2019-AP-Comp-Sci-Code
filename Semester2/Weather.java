import java.util.Scanner;

public class Weather 
{
	private String[][]temps;
	private Scanner kb = new Scanner(System.in);
	
	public Weather(int amount) 
	{
		temps = new String[5][amount]; //rows, columns
	} 
	public void setCities()
	{
		for(int i=0; i<temps[1].length; i++)
		{
			System.out.println("Enter in your first city.");
			temps[0][i] = kb.nextLine();
		}
	}
	public String getCities()
	{
		String names ="";
		for(int i=0; i<temps[1].length; i++)
		{
			names = names + temps[0][i]+" ";
		}
		return names; 
	}
	public void setTemps()
	{
		for(int i = 0; i<temps[1].length; i++)
		{
			System.out.println("Enter the tempetures for the city of " + temps[0][i] + ".");
			for(int k = 0; k<1; k++)
			{
				System.out.println("January:");
				temps[1][i] = kb.nextLine();
				System.out.println("Febuary:");
				temps[2][i] = kb.nextLine();
				System.out.println("March:");
				temps[3][i] = kb.nextLine();
				System.out.println("April:");
				temps[4][i] = kb.nextLine();
			}
		}
	}
	public void printOutArray()
	{
		for(int i=0; i<temps[0].length; i++)
		{
			System.out.print(temps[0][i]+" ");
			for(int k=1; k<temps.length; k++)
			{
				System.out.print(temps[k][i]+" ");
			}
			System.out.println(" ");
		}
		for(int i=0; i<temps[0].length; i++)
		{
			int avg = ((Integer.parseInt(temps[1][i]) + 
						Integer.parseInt(temps[2][i]) + 
						Integer.parseInt(temps[3][i]) +
						Integer.parseInt(temps[4][i]))/4);
			System.out.println("The average of the temps for the city #" + (i+1) + " is: " + avg);
		}
	}
}
