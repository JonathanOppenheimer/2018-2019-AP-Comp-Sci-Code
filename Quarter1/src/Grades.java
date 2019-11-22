import java.util.Scanner;

public class Grades 
{
	public static void main (String[]args) 
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in a numerical test score");
		double score1 = kb.nextDouble();
		System.out.println("Enter in a second numerical test score");
		double score2 = kb.nextDouble();
		System.out.println("Enter in a third numerical test score");
		double score3 = kb.nextDouble();
		System.out.println("Enter in a fourth numerical test score");
		double score4 = kb.nextDouble();
		System.out.println("Enter in a fifth numerical test score");
		double score5 = kb.nextDouble();
		System.out.println("Your scores are " + score1 + ", " + score2 + ", " + score3 + ", " + score4 + "and " + score5);
		double average = ((score1 + score2 + score3 + score4 + score5)/5);
		System.out.println("Your average is " + average);
		if(average >= 90) 
			System.out.println("Your letter grade is a A");
		else if(average >= 80) 
			System.out.println("Your letter grade is a B");
		else if(average >= 70) 
			System.out.println("Your letter grade is a C");
		else if(average < 70)
			System.out.println("Your letter grade is an F");
		kb.close();
	}
}
