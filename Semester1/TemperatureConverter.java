import java.util.Scanner;

public class TemperatureConverter 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String answer = "yes";
		
		while(answer.equals("yes")) 
		{
			double temperature = 0;
			System.out.println("Do you want convert to");
			System.out.println("1. C - F");
			System.out.println("2. F - C");
			int pref = kb.nextInt();
			if(pref == 1) 
			{
				System.out.println("You are converting from C to F. Enter in the degrees.");
				temperature = kb.nextDouble();
				temperature = ((temperature + 32)*1.8);
				System.out.println("The celcius value would be "  + (temperature) + " degrees");
			}
			else
			{
				System.out.println("You are converting from F to C. Enter in the degrees");
				temperature = kb.nextDouble();
				temperature = ((temperature - 32)*(5.0/9));
				System.out.println("The fahrenheit value would be "  + (temperature) + " degrees.");
			}
			System.out.println("Do you want to go again? Enter yes or no");
			answer = kb.next();
		}
		kb.close();
	}
}
