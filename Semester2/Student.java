import java.util.Scanner;

public class Student 
{
	Scanner kb = new Scanner(System.in);
	private String name;
	private int age;
	@SuppressWarnings("unused")
	private int score;
	private int total = 0;
	
	public Student(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void PrintStuff() 
	{
		System.out.println("Name: " + name + ", Age: " + age);
	}
	public int getPower()
	{
		int power = (int)(Math.random()*100+1);
		return power;
	}
	
	//assignment
	
	public int average(int score)
	{
		this.score=score;
		for(int i=0; i<score; i++)
		{
			System.out.println("Enter in a score");
			total = total + kb.nextInt();
		}
		total = total/score;
		score = total;
		return score;
	}
	
}
