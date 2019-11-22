import java.util.Scanner;

public class MultipleChoice 
{
	String[][] questions;
	Scanner kb = new Scanner(System.in);
			
	public MultipleChoice(int amt) {
		questions = new String[amt][2];
	}
	public void setQuestions()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Question #" + (i+1));
			System.out.println("Enter in your question");
			questions[i][0] = kb.nextLine();
			System.out.println("Enter the answer to that question");
			questions[i][1] = kb.nextLine();
			System.out.println("*************************");
		}
	}
	public void askQuestions()
	{
		int counter = 0;
		for(int i=0; i<5; i++)
		{
			System.out.println("Question " + (i+1) + ": " + questions[i][0]);
			String answer = kb.nextLine();
			if(answer.equalsIgnoreCase(questions[i][1]))
			{
				System.out.println("You got it right!");
				counter++;
			}
			else
			{
				System.out.println("You got it wrong.");
			}
		}
		System.out.println("You got " + counter + " questions right.");
	}
}
