import java.util.Scanner;


public class QuizArray {
	public static void main(String[]args)
	{
		double lowest1 = Double.POSITIVE_INFINITY;
		double lowest2 = Double.POSITIVE_INFINITY;
		Scanner kb = new Scanner(System.in);
		System.out.println("How many quizzes are there? Enter at least 2");
		int quiznumbers = kb.nextInt();
		int [] Scores = new int[quiznumbers];
		
		for(int i = 0; i<quiznumbers; i++)
		{
			System.out.println("Enter in a a quiz score");
			Scores[i] = kb.nextInt();
		}
		for(int i = 0; i<quiznumbers; i++)
		{
			if(Scores[i]<=lowest1) 
			{
				lowest1 = Scores[i];
			}
		}
		for(int i = 0; i<quiznumbers; i++)
		{
			if(Scores[i]<=lowest2 && Scores[i]!=lowest1) 
			{
				lowest2 = Scores[i];
			}
		}
		System.out.println("The 2 lowest scores are " + lowest1 + " and " + lowest2);
		int average = 0;
		for(int i = 0; i<quiznumbers; i++)
		{
			average = average + Scores[i];
		}
		double averagedone = (average/quiznumbers);
		System.out.println("The average score was " + averagedone);
		kb.close();
	}
}