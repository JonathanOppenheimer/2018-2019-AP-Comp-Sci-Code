import java.util.Scanner;

public class StudentMason 
{
	private int idNumber;
	private String name;
	public StudentMason()
	{
		idNumber = -666666;
		setName();
		name="John Doe";
		setID();
	}
	public StudentMason(int id, String name)
	{
		idNumber = id;
		this.name = name;
	}
	public void setName()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your name.");
		name = kb.nextLine();
		System.out.println(name + " was entered.");
	}	
	public String getName()
	{
		return name;
	}
	public void setID()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your student ID.");
		idNumber = kb.nextInt();
		System.out.println(idNumber + " was entered.");
	}
	public int getID()
	{
		return idNumber;	
	}
}
