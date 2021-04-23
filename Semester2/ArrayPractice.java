import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		//array 1
		int [] numbers = new int[20];
		for(int i=0; i<20; i++)
		{
			int random =(int)(Math.random()*19+55);
			numbers[i]= random;
		}
		System.out.println(java.util.Arrays.toString(numbers));
		
		//finder
		int checker = 0;
		for(int i=1; i<20; i++)
		{
			if(numbers[i]>checker)
			{
				checker = numbers[i];
			}
		}
		System.out.println("The greatest number in the array is " + checker + ".");
		
		//array 2
		System.out.println("How many characters are in your name");
		int length = kb.nextInt();
		String [] name = new String[length];
		for(int i=0; i<length; i++)
		{
			System.out.println("What charcter is " + (i+1) + " in your name?");
			name[i]=kb.next();
		}	
		System.out.println("Your name in an array is:");
		System.out.println(java.util.Arrays.toString(name));
		kb.close();
	}
}
