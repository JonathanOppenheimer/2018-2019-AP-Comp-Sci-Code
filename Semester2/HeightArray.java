import java.util.Scanner;

public class HeightArray {
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int [] heights = new int[12];
		for(int i=0; i<12; i++)
		{
			heights[i] = (int)(Math.random()*21+55);
		}
		for(int i=0; i<12; i++)
		{
			System.out.print(heights[i] + " ");
		}
		int highest = 0;
		int spot = 0;
		System.out.println();
		for(int i=0; i<12; i++)
		{
			if(heights[i]>highest)
			{
				highest = heights[i];
				spot = i;
			}
		}
		System.out.println("The highest height was " + highest + " and was in spot " + (spot+1) + " ");
		//switching
		heights[spot] = heights[11];
		heights[11]=highest;
		kb.close();
		System.out.println("Switched array. Last has now been switched with the highest.");
		for(int i=0; i<12; i++)
		{
			System.out.print(heights[i] + " ");
		}
		
		highest = heights[10];
		spot = 10;
		for(int i=0; i<heights.length; i++)	
		{
			if(heights[i]>highest)
			{
				highest = heights[i];
				spot = i;
			}
		}
		//swap
		int holder = heights[10];	
	}
}
