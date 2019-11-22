import java.util.Scanner;

public class TwoDimensionalArray 
{
	Scanner kb = new Scanner(System.in);
	
	//1 dimensional array that holds 3 strings
	String [] names = new String [3];
	double [][] gpa = new double [2][5];
	//5 rows and 2 columns
	
	public void setGPA()
	{
		for(int i=0; i<5; i++)
		{
			for(int k=0; k<2; k++)
			{
				System.out.println("Person at spot " + k + ", " + i + " what is your GPA?");
				double temp = kb.nextDouble();
				gpa[k][i] = temp;
			}
		}
	}
	public void findGPA()
	{
		System.out.println("What row would you like to look up?");
		int row = kb.nextInt();
		System.out.println("What column would you like to look up?");
		int column = kb.nextInt();
		System.out.println(gpa[row][column]);
	}
	public void setNames() 
	{
		for(int i=0; i<3; i++)
		{
			System.out.println("What is your name?");
			names[i] = kb.next();
		}
	}
	public void printNames()
	{
		String temp = "";
		for(int i=0; i<3; i++)
		{
			temp = names[i];
			System.out.println(temp);
		}
	}
}
