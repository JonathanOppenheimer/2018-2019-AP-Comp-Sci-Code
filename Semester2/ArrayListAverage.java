import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAverage 
{
	@SuppressWarnings("unlikely-arg-type")

	public static void main(String[]args)
	{
		int temp = Integer.MIN_VALUE;

		Scanner kb = new Scanner(System.in);
		ArrayList <Integer> nums = new ArrayList<Integer>(0);
	
		for(int i=0; i<10; i++)
		{
			System.out.println("Add number #" + (i+1) + " to the array.");
			nums.add(kb.nextInt());
		}
		for(int i=0; i<10; i++)
		{
			if(nums.get(i) > temp)
			{
				temp = nums.get(i);
			}
		}
		nums.remove(Integer.valueOf(temp));
		System.out.println("Integer " + temp + " was removed.");
		temp = 0;
		System.out.print(nums);
		for(int x : nums)
		{
			temp = temp + x;
			
		}
		temp = temp/nums.size();
		System.out.println("The average of the remaining numbers was: " + temp);
	}
}
