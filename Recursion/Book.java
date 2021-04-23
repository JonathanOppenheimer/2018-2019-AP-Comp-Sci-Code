import java.util.Scanner;

public class Book 
{
	private String title;
	private boolean aval;
	private double fine;
	Scanner kb = new Scanner(System.in);

	public Book(String title, boolean aval, double fine)
	{
		this.title=title;
		this.aval=aval;
		this.fine=fine;
	}

	public Book()
	{
		setTitle();
		setAval();
		setFine();
	}
	public String toString()
	{
		String sentence =  "Title: " + title + " Available: " + aval + " Fine: " + fine;
		return sentence;

	}

	private void setTitle()
	{
		System.out.println("What is the title of the new book?");
		title = kb.next();
	}

	private void setAval()
	{
		System.out.println("What is the availibility status of the new book?");
		aval = kb.nextBoolean();
	}

	private void setFine()
	{
		System.out.println("What is the fine price of the new book?");
		fine = kb.nextDouble();
	}

	public String getTitle()
	{ 
		return title;
	}

	public boolean getAval()
	{ 
		return aval;
	}

	public double getFine()
	{ 
		return fine;
	}
}

