import java.util.Scanner;

public class BookMain 
{
	public static void main(String[]args)
	{
		Book book1 = new Book("Harry Potter 5: Order of the Pheonix", true, .75);
		Book book2 = new Book("Battle Royale", false, .50);
		System.out.println(book1);
		System.out.println(book2);
		Book book3 = new Book();
		System.out.println(book3);

		Scanner kb = new Scanner(System.in);
		System.out.println("What book would you like to take out?");
		String answer = "yes";

		while(answer.equalsIgnoreCase("yes"))
		{
			if(kb.nextLine().equalsIgnoreCase(book1.getTitle()))
			{
				if(book1.getAval() == true)
				{
					System.out.println(book1.getTitle() + " is a available with a fine of " + book1.getFine() + ".");
				}
				else
				{
					System.out.println(book1.getTitle() + " is not available.");
				}
			}

			if(kb.nextLine().equalsIgnoreCase(book2.getTitle()))
			{
				if(book2.getAval() == true)
				{
					System.out.println(book2.getTitle() + " is a available with a fine of " + book2.getFine() + ".");
				}
				else
				{
					System.out.println(book2.getTitle() + " is not available.");
				}
			}

			if(kb.nextLine().equalsIgnoreCase(book3.getTitle()))
			{
				if(book3.getAval() == true)
				{
					System.out.println(book3.getTitle() + " is a available with a fine of " + book3.getFine() + ".");
				}
				else
				{
					System.out.println(book3.getTitle() + " is not available.");
				}
			}
			else
			{
				System.out.println("That book is not available");
			}

			System.out.println("Would you like to search again?");
			answer = kb.next();
		}
		kb.close();
	}
}
