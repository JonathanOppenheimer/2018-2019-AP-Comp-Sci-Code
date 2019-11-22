public class MultipleChoiceMain 
{
	public static void main(String[]args)
	{
		MultipleChoice history = new MultipleChoice(5);
		history.setQuestions();
		for(int i=2; i<10; i++)
		{
			history.askQuestions();
		}
	}
}
