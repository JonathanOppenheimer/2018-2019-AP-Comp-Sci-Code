import java.util.Scanner;

public class TenAssignments 
{ 
	public static void main (String[]args) 
	{
		/* 1 */
		Scanner kb = new Scanner(System.in);
		System.out.println("(#1 prompt 1) What is your name?");
		String name = kb.next();
		System.out.println("Welcome " + name + "!");
		/* 2 */
		System.out.println("(#2 prompt 1) Enter in a string");
		String name2a = kb.next();
		System.out.println("(#2 prompt 2) Enter in another string");
		String name2b = kb.next();
		System.out.println(name2a + name2b + name2b + name2a);
		/* 3 */
		System.out.println("(#3 prompt 1) Enter in a HTML tag");
		String name3a = kb.next();
		System.out.println("(#3 prompt 2) Enter in a string");
		String name3b = kb.next();
		System.out.println("<" + name3a + ">" + name3b + "</" + name3a + ">");
		/* 4 */
		System.out.println("(#4 prompt 1) Enter in a string with at least 2 characters");
		String name4 = kb.next();
		int count = name4.length();
		String fragment = name4.substring((count-2), count);
		System.out.println(fragment + fragment + fragment);
		/* 5 */
		System.out.println("(#5 prompt 1) Enter in a string");
		String name5 = kb.next();
		int count5 = name5.length();
		if(count5<2)
			System.out.println(name5);
		else
		{
			String name5a = name5.substring(0, 2);
			System.out.println(name5a);
		}
		/* 6 */
		System.out.println("(#6 prompt 1) Enter in an even string");
		String name6 = kb.next();
		int count6 = name6.length();
		String fragment6 = name6.substring(0, (count6/2));
		System.out.println(fragment6);
		/* 7 */
		System.out.println("(#7 prompt 1) Enter in a string with at least 2 characters");
		String name7 = kb.next();
		int count7 = name7.length();
		String fragment7 = name7.substring(1, (count7 - 1));	
		System.out.println(fragment7);
		/* 8 */
		System.out.println("(#8 prompt 1) Enter in a string");
		String name8a = kb.next();
		System.out.println("(#8 prompt 2) Enter in a string with more or less characters than the first");
		String name8b = kb.next();
		int count8a = name8a.length();
		int count8b = name8b.length();
		if(count8a > count8b)
			System.out.println(name8b + name8a + name8b);
		else
			System.out.println(name8a + name8b + name8a);
		/* 9 */
		System.out.println("(#9 prompt 1) Enter in a string");
		String name9a = kb.next();
		System.out.println("(#9 prompt 2) Enter in a string");
		String name9b = kb.next();
		int count9a = name9a.length();
		String fragment9a = name9a.substring(1, count9a);	
		int count9b = name9b.length();
		String fragment9b = name9b.substring(1, count9b);	
		System.out.println(fragment9a + fragment9b);
		/* 10 */
		System.out.println("(#10 prompt 1) Enter in a string");
		String name10 = kb.next();
		int count10 = name10.length();
		String fragment10a = name10.substring(0, 2);
		String fragment10b = name10.substring(2, count10);
		System.out.println(fragment10b + fragment10a);
		kb.close();
	}
}

