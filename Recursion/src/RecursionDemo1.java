public class RecursionDemo1 
{
	public static void main(String[]args)
	{
		System.out.println("writeVertical(3)");
		writeVertical(3);
		System.out.println("writeVertical(12)");
		writeVertical(12);
		System.out.println("writeVertical(567)");
		writeVertical(567);
		
	}
	
	public static void writeVertical(int n)
	{
		if(n<10)
		{
			System.out.println(n);
		}
		else
		{
			writeVertical(n/10);
			System.out.println(n%10);
		}
	}
}
