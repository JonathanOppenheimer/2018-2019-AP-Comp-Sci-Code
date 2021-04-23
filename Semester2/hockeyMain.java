import java.util.Scanner;

public class hockeyMain {
	public static void main(String[]args)
	{
		//import
		Scanner kb = new Scanner(System.in);
		//introduction
		System.out.println("Welome to the hockey program!");
		System.out.println("How many players would you like to index?");
		int num = kb.nextInt();
		//declare objects
		hockey objA = new hockey(num);
		//runs objects
		objA.basicSetUp();
		objA.getInfo();
		System.out.println(objA);
	}
}
