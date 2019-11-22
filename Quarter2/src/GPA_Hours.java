import java.util.Scanner;

public class GPA_Hours 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How many GPAs would you like to enter?");
		int times = kb.nextInt();
		double [] GPA = new double[times];
		for(int i=0; i<times; i++)
		{
			System.out.println("Enter in a GPA");
			GPA[i] = kb.nextDouble();
		}
		double low = 10;
		double high = 0;
		for(int i=0; i<times; i++)
		{
			if(GPA[i]<low)
			{
				low = GPA[i];
			}
		}
		for(int i=0; i<times; i++)
		{
			if(GPA[i]>high)
			{
				high = GPA[i];
			}
		}
		double total = 0;
		for(int i=0; i<times; i++)
		{
			total = total + GPA[i];
		}
		total = total - high;
		total = total - low;
		double average = ((total)/(times-2));
		System.out.println("The average GPA, after throwing out the highest and lowest GPAs is a " + average + " GPA.");
		kb.close();
	}
}