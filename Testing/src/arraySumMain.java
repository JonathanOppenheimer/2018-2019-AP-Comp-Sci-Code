import java.util.Arrays;

public class arraySumMain extends practice
{
	public static void main(String[]args)
	{
		int [] test = {4, 5, 6, 7, 8, 9};
		int [][] test2 ={{4, 5, 6, 7, 8, 9}, 
						 {4, 5, 6, 7, 8, 9},
						 {4, 5, 6, 7, 8, 9}};
		System.out.println(arraySum(test));
		System.out.println(Arrays.toString(rowSums(test2)));
	}
}
