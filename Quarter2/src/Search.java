import java.util.Scanner;

public class Search 
{
	Scanner kb = new Scanner(System.in);
	private int [] arr = new int[20]; 
	public void fillArray()
	{
	 	for(int i = 0; i<arr.length; i++)
		{
			arr[i] = (int)(Math.random()*15 + 13);
		}
	}
	public void printArray()
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
	public void searchArray()
	{
		System.out.println("What number do you want to search for");
		int answer = kb.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == answer)
			{
				System.out.println("The number was located at position " + i);
			}		
			if(i != (arr.length+2))
			{
				System.out.println(answer + "was not found.");
			}
		}
		System.out.println("The number was not located at any other position");
	}
}