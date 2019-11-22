import java.util.Scanner;

public class testing 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		double max = inp.nextDouble();
		//write your code below
		boolean check = false;
		for(int i=2; i<(max/2); i++)
		{
			if(max%i==0)
			{
				check = true;
			}
		}
		if(check==true)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
}
