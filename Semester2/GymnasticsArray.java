import java.util.Scanner;

public class GymnasticsArray
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		double [] scores = new double[6];
		for(int i = 0; i<6; i++)
		{
			System.out.println("Enter in a score");
			scores[i] = kb.nextDouble();
		}
		double lowest = 100000;
		int spot = 0;
		for(int i=0; i<6; i++)
		{
			for(int j=0; j>i; j++)
			{
				if(scores[j]<lowest)
				{
					lowest = scores[j];
					spot = j;
				}
				double temp = scores[j];
				scores[j] = lowest; 
				scores[spot] = temp;
			}
		}
		System.out.println();
		for(int i=0; i<6; i++)
		{
			System.out.print(scores[i] + ", ");
		}
		kb.close();
	}
}
