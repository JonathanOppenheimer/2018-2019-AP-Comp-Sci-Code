import java.util.Scanner;

public class WeatherMain 
{
	public static void main(String [] args)
	{
		Scanner kb  = new Scanner(System.in);
		System.out.println("How many cities will you be entering?");
		int amount = kb.nextInt();
		
		Weather cities = new Weather(amount);	
		cities.setCities();
		cities.setTemps();
		cities.printOutArray();
	}
}
