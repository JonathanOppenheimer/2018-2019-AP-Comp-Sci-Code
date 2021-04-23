public class die 
{
	private int[]rolls;
	
	public void rolling(int maxRoll, int timeRoll) 
	{
		rolls = new int[timeRoll];
		for(int i=0; i<timeRoll; i++)
		{
			rolls[i]=(int)Math.random() * (maxRoll + 1);
		}
	}

	public int findLargestRun(int maxRoll, int timeRoll) 
	{
		int count = 0;
		int maintainCount = 0;
		
		for(int i=1; i<(timeRoll); i++)
		{
			if(rolls[i-1]==rolls[i])
			{
				count++;
			}
			else
			{
				count = 1;
			}
			
			if(count>maintainCount)
			{
				maintainCount = count;
			}
			
		}
		System.out.println("The longest continous run of the same number happened " + maintainCount + " times");
		return count;
	}
}
