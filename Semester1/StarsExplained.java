import java.util.Scanner;

public class StarsExplained 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How many lines?");
		int amount = kb.nextInt();
		for(int i = 1; i<=amount; i++) {
			int count = 1;
			while(count<=i) {
				System.out.print("*");
				count++;
				
			}
			System.out.println();
		}
		System.out.println();
		for(int i = amount; i>=1; i--) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		kb.close();
	}
}
