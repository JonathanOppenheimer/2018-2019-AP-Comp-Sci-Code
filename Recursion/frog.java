public class frog 
{
	double successes = 0;
	double totalRuns = 0;
	boolean metGoal = false;
	int traveled = 0;
	int distance = 0;
	int maxHops = 0;
	double percentage=0;

	public frog(int distance, int maxHops) 
	{
		this.distance = distance;
		this.maxHops = maxHops;
		
	}
	public void hopDistance()
	{
		for(int i=0; i<maxHops; i++)
		{
			int temp = 0 ;
			temp = (int) (Math.random()* (distance+7) - 7);
			traveled = traveled + temp;

			if(traveled < 0)
			{
				i = maxHops * 2;
			}
		}
		totalRuns++;
	}
	public void booleanSimulator()
	{
		if(traveled > distance)
		{
			metGoal = true;
			successes++;
		}
	}
	public void doubleFunSimulator()
	{
		percentage = ((successes/totalRuns)*100);
	}
	public void printOut() 
	{
		System.out.println("Success? : " + metGoal);
		System.out.println("The frog traveled a total of " + traveled + " feet out of a goal of " + distance + " feet.");
		System.out.println("The frog successfully met the goal " + percentage + "% of the time.");	
	}
	public void reset()
	{
		traveled = 0;
		metGoal = false;
		
	}
}
