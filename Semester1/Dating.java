import java.util.Scanner;

public class Dating 
{
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first partner's age");
		double name1 = kb.nextDouble();
		System.out.println("Enter the second partner's age");
		double name2 = kb.nextDouble();
		if(name1 > name2) {        
		    if(((name1/2 + 7)<name2)) {     
		    	System.out.println("You can date each other");
		    } else {            
		    	System.out.println("You can't date each other");
		    }
		}
		else if(name1 < name2){        
		    if(((name2/2 + 7)<name1)) {     
		    	System.out.println("You can date each other");
		    } else {            
		    	System.out.println("You can't date each other");
		    }
		}
		else if(name1 == name2)
			System.out.println("You can date each other");
		kb.close();
	} 
}
