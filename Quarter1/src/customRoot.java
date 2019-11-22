import java.util.Scanner;

public class customRoot {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		String answer = "yes";
		while(answer.equals("yes"))
		{
			System.out.println("Enter in the number you want to guess the root of");
			double number = kb.nextDouble();
			System.out.println("Enter in the root guess");
			double guess = kb.nextDouble();
			System.out.println("How many times do you want to run the loop?");
			int loops = kb.nextInt();
			for(int i=1; i<=loops; i++){
				double runner = (number/guess);
				guess = ((guess + runner)/2);
				System.out.println("Answer for round " + i + " is " + guess);
			}
			System.out.println("Do you want to go again?");
			answer = kb.next();
		}
		kb.close();
	}
}