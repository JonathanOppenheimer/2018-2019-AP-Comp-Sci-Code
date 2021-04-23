import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class hockey 
{
	Scanner kb = new Scanner(System.in);
	String stats[][];
	int numPull;
	
	public hockey(int num)
	{
		stats = new String[num+2][4];
		numPull = num;
	}	
	public void basicSetUp()
	{
		stats[0][0] = "Name:";
		stats[0][1] = "Goals:";
		stats[0][2] = "Assist:";
		stats[0][3] = "Points:";
		stats[numPull+1][0] = "Average:";
	}
	public void getInfo()
	{
		for(int i=1; i<numPull+1; i++)
		{
			//variable declaration
			String temp1; 
			int temp1A;
			String temp2; 
			int temp2A;
			String temp3; 
			int temp3A;
			//getting info
			System.out.println("What is player #" + i + "s name?");
			stats[i][0] = kb.nextLine();
			System.out.println("How many goals did player #" + i + "s score?");
			temp1 = kb.nextLine();
			stats[i][1] = temp1;
			System.out.println("How many assists did player #" + i + "s have?");
			temp2 = kb.nextLine();
			stats[i][2] = temp2;
			//conversion
			temp1A = Integer.parseInt(temp1);	
			temp2A = Integer.parseInt(temp2);
			temp3A = (temp1A + temp2A);
			temp3 = Integer.toString(temp3A);
			stats[i][3] = temp3;		
		}
		//average introduction
		for(int k = 1; k<4; k++)
		{
			double temp = 0;
			
			for(int j=1; j<numPull+1; j++)
			{
				temp = temp + Integer.parseInt(stats[j][k]);
			}
			double avg = (temp/numPull);
			stats[numPull+1][k] = Double.toString(avg); 
		}
	}

	public String toString()
	{
		String sentence = "**************\n";
		for(int cols = 0; cols<stats[0].length; cols++)
		{
			for(int rows = 0; rows<stats.length; rows++)
			{
				sentence = sentence + stats[rows][cols]+ "\t";
			}
			sentence = sentence + "\n";
		}
		return sentence;
	}
}
