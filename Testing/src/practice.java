public class practice 
{
	public static int arraySum(int[] arr) 
	{
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	public static int[] rowSums(int[][] arr2D) 
	{
		int[]sums = new int[arr2D[0].length];
		
		for(int i=0; i<arr2D[0].length; i++)
		{
			for(int j=0; j<arr2D.length; j++)
			{
				sums[i] = sums[i] + arr2D[j][i];
			}
		}
		return sums;
	}
}
