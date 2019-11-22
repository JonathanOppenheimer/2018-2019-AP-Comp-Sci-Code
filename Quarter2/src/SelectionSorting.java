
public class SelectionSorting {
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=(int)(Math.random()*20+41);
		}
		for(int i=0; i<numbers.length; i++)
		{
			System.out.print(numbers[i] + ", ");
		}
		for(int j = 0; j<numbers.length; j++)
		{
			System.out.println();
			int small = numbers[j];
			int spot = j;
			for(int k = (j+1); k<numbers.length; k++)
			{
				if(numbers[k]<small)
				{
					small = numbers[k];
					spot = k;
				}
			}
			int temp = numbers[j];
			numbers[j] = numbers[spot];
			numbers[spot] = temp;
			for(int i=0; i<numbers.length; i++)
			{
				System.out.print(numbers[i] + ", ");
			}
		}
	}
}	