public class BubbleSort 
{
	//include all the methods the object can use
	
	//global array
	int [] array = {11, 12, -5, 15, 1, 2, 4};
	
	//constructor 
	public BubbleSort()
	{
		
	}
	public void sortTheArray()
	{
		for(int i = array.length-1; i>0; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				if(array[j-1] > array[j])
				{
					int holder1 = array[j-1];
					int holder2 = array[j];
					array[j] = holder1;
					array[j-1] = holder2;
				}
				else
				{
					int holder1 = array[j-1];
					int holder2 = array[j];
					array[j - 1] = holder1;
					array[j] = holder2;
				}
			}
		}
	}
	public void printMe()
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}
