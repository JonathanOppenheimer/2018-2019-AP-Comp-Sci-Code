
public class ArrayDice 
{
	public static void main(String[]args) 
	{
		int [] holder = new int[10];
		for(int i=0; i<=9; i++)
		{
			int die =(int)(Math.random()*6+1);
			holder[i]= die;
		}
		System.out.println(java.util.Arrays.toString(holder));
		holder[7]=15;
		for(int j=0; j<holder.length; j++) 
		{
			System.out.print(holder[j] + " ");
		}
	}
}
