public class MiniCalculator 
{
	public static void main(String[]args)
	{
		double numOne = 3;
		double numTwo = 2;
		System.out.println(numOne + " + " + numTwo + " = " + ( numOne + numTwo));
		System.out.println(numOne + " - " + numTwo + " = " + ( numOne - numTwo));
		System.out.println(numOne + " * " + numTwo + " = " + ( numOne * numTwo));
		System.out.println(numOne + " / " + numTwo + " = " + ( numOne / numTwo));
		/* truncating the decimal - integer/integer = integer
		 * double/integer = double */
		System.out.println(numOne + " % " + numTwo + " = " + ( numOne % numTwo));
		/* % modular division 22 modular 4 = 2 */
		System.out.println(numOne + " % " + numTwo + " = " + ( numOne % numTwo));
		System.out.println(Math.sqrt(numOne));
		System.out.println(Math.pow(numTwo,2));
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(numOne + numTwo * numOne - numTwo);
	}
}