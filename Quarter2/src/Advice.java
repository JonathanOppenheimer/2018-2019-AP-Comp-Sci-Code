
public class Advice extends Thought
{
	public void message()
	{
		System.out.println("Warning: Dates in calendar are closer than they appear.");
		System.out.println("");
		super.message();
	}
}
