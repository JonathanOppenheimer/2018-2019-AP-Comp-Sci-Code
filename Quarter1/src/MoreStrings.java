public class MoreStrings 
{
	public static void main (String[]args) 
	{
		String result = "Welcome to Bryce Resort! Where Clark eats all the Sandwhiches.";
		String result2 = "Robots will kill everyone or ice tea";
		char letter = result.charAt(6);
		System.out.println(letter);	
		/* first c to second c */
		String fragment = result.substring(3, 15);
		System.out.println(fragment);	
		/* print how many characters are in result */
		int count = result.length();
		System.out.println(count);	
		int spot = result2.indexOf('s');
		System.out.println(spot);
		/* result2.setCharAt(0,'M'); */
		int rando = (int)(Math.random() * 7 + 2);
		System.out.println(rando);
	}
}