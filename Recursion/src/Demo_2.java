public class Demo_2 
{
	public static void main(String[]args)
	{
		System.out.println(recur(5));
	}
	
	public static int recur(int x)
	{
		//base case
		if(x==1)
		{
			return 5;
			
		}
		else if(x>1)
		{
			System.out.println(x + " + recur(" + (x+1) + ")");
			return x + recur(x-1);
		}
		return -10;
	}
}
