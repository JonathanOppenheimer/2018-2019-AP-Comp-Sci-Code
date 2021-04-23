import java.util.ArrayList;
import java.util.Scanner;

public class Playlist 
{
	private ArrayList <String> songs = new ArrayList<String>(0);
	Scanner kb = new Scanner(System.in);
	private String answer = "";
	private String answer1 = "";
	
	public void addSongs()
	{
		songs.add(kb.next());
		System.out.println("Enter in the time of that song (X:XX)");
		songs.add(kb.next());
	}
	public void deleteSongs()
	{
		System.out.println("Would you like to remove by title or by time?");
		answer = kb.next();
		if(answer.equalsIgnoreCase("title"))
		{
			System.out.println("Enter in the title of the song you'd like to remove. ");
			answer1 = kb.next();
			
			for(int i = 0; i<songs.size(); i++)
			{
				if(songs.get(i).equalsIgnoreCase(answer1))
				{
					songs.remove(i);
					songs.remove(i+1);
				}
			}
		}
		if(answer.equalsIgnoreCase("time"))
		{
			System.out.println("Enter in the time of the song you'd like to remove. (X:XX)");
			answer1 = kb.next();
			for(int i = 0; i<songs.size(); i++)
			{
				if(songs.get(i).equalsIgnoreCase(answer1))
				{
					songs.remove(i);
					songs.remove(i-1);
				}
			}
		}
	}
}
