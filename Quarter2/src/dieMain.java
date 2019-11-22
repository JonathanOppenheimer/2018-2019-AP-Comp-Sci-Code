public class dieMain {
	public static void main(String[]args)
	{
		die rolling = new die();
		int maxRoll = 10;
		int timeRoll = 20;
		//
		rolling.rolling(maxRoll, timeRoll);
		rolling.findLargestRun(maxRoll, timeRoll);
	}
}
