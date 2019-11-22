import java.util.Scanner;
public class MathGrade 
{
	//global variables (not inside methods)
	int classSize;
	//constructor
	public MathGrade(int temp)
	{
		classSize = temp;
	}
	public void randomGradeGenerator()
	{
		for(int i = 0; i<=classSize; i++)
		{
			int grade = (int)(Math.random() * 101);
			System.out.println("Student " + i + " grade is " + grade);
		}
	}
	public void choiceGrade()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to randomly choose your grade?");
		String answer = kb.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Congratulations on your choice. Would you like to choose bin A or bin B?");
			String answer1 = kb.next();
			if(answer1.equalsIgnoreCase("A"))
			{
				int random = (int)(Math.random() * 101);
				if(random>=25)
				{
					System.out.println("Congratulations your grade is now a 95");
				}
				else
				{
					System.out.println("Congratulations your grade is now a 55");
				}
			}
			else
			{
				int random1 = (int)(Math.random() * 101);
				if(random1>=66)
				{
					System.out.println("Congratulations your grade is now a 95");
				}
				else if(random1<66 && random1>=33)
				{
					System.out.println("Congratulations your grade is now a 85");
				}
				else
				{
					System.out.println("Congratulations your grade is now a 75");
				}
			}
		}
		else
		{
			System.out.println("Your grade remained the same");
		}
	}
}
