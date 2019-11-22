import java.util.Scanner;

public class PlaylistMain 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String answer = "yes";
		Playlist objA = new Playlist();
		
		while(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter in a song.");
			objA.addSongs();
			System.out.println("Would you like to remove a song?");
			answer = kb.next();
			if(answer.equalsIgnoreCase("yes"))
			{
				objA.deleteSongs();
			}
			System.out.println("Would you like to continue?");
			answer = kb.next();
		}
	}
}
