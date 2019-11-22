import java.util.Scanner;

public class StudentMain
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Student matteObj = new Student("Matteo",16);
		Student ryanObj = new Student("Ryan", 17);
		matteObj.PrintStuff();
		ryanObj.PrintStuff();
		int student1 = matteObj.getPower();
		int student2 = ryanObj.getPower();
		if(student1 < student2)
		{
			System.out.println("Student 1 lost the fight");
		}
		else
		{
			System.out.println("Student 2 lost the fight");
		}
		
		//assignment
		
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("How many quizzes did you take?");
		int score = kb.nextInt();
		Student custom = new Student(name, score);
		score = custom.average(score);
		System.out.println(name + "'s average score was " + score);
		kb.close();
	}
}
