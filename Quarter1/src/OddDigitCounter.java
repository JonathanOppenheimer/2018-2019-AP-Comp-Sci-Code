import java.util.Scanner;

public class OddDigitCounter {
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String answer = "yes";
		while(answer.equals("yes")) 
		{
			System.out.println("Enter in a 5 digit number.");
			int number = kb.nextInt();
			int pos1 = number / 10000;
			int pos2 = number % 10000 / 1000;
			int pos3 = number % 1000 / 100;
			int pos4 = number % 100 / 10;
			int pos5 = number % 10;
			if(pos1%2 == 0 || pos2%2 == 0 || pos3%2 == 0 || pos4%2 == 0 || pos5%2 == 0) {
					System.out.println("You number does not have odd digits at every place.");
				}
				else {
					System.out.println("You number has odd digits at every place.");
				}
			System.out.println("Do you want to go again? Enter yes or no");
			answer = kb.next();
		}
		kb.close();	
	}
}

/* Original Method below for the if() is below
 * ((pos1) == 1 || pos1==3 || pos1==5 || pos1==7 || pos1==9) &&
 * ((pos2) == 1 || pos2==3 || pos2==5 || pos2==7 || pos2==9) &&
 * ((pos3) == 1 || pos3==3 || pos3==5 || pos3==7 || pos3==9) &&
 * ((pos4) == 1 || pos4==3 || pos4==5 || pos4==7 || pos4==9) &&
 * ((pos5) == 1 || pos5==3 || pos5==5 || pos5==7 || pos5==9))*/