public class StringThings 
{
	public static void main (String[]args)
	{
		String sentence = "This is a sentence";
		/* How many characters? */
		int count = sentence.length();
		System.out.println(sentence + " is "  + count + " characters long");
		if(count<10)
			sentence = sentence + " says Ian";
			else if(count<20)
				sentence = sentence + " says Ryan";
			else
				sentence = "The Redskins won";
		System.out.println(sentence);
		String fragment = sentence.substring(1,7);
		System.out.println(fragment);
		char letter = fragment.charAt(0);
		System.out.println(letter);
	}
}
