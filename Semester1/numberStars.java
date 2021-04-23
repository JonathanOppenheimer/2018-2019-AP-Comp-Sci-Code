import java.util.Scanner;

public class numberStars 
{
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in a number"); 
		int stars = kb.nextInt();
		int rounds = stars;
		int keep = stars;
		while(stars>0) {
			System.out.print("*"); 
			stars--;
			if(stars==0){
				System.out.println();
				stars = rounds-1; 
				rounds--;
			}
		}
		
		
		stars = 1;
		rounds = 1;
		
		
		while(stars>0) {
			System.out.print("*"); 
			stars--;
			rounds++;
			if(stars==0){
				System.out.println();
				stars = stars + rounds;
				if(rounds>=keep) {
					break;
				}
			}
		}
		kb.close();
	}
}

