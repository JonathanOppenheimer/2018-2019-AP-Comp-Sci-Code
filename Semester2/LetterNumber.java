public class LetterNumber 
{
	String type = "";
	public void letterOrWord(String temp)
	{
		if(temp.equals("1") || temp.equals("2") || temp.equals("3") || temp.equals("4") || temp.equals("6") || temp.equals("6"))
		{
			type.equals("number");
		}
		else
		{
			type.equals("word");
		}
	}
	public void converToNum(String temp)
	{
		if(type.equalsIgnoreCase("word"))
		{
			if(temp.equals("one"))
			{
				temp.equals("1");
				System.out.println(temp);
			}
			else if(temp.equals("two"))
			{
				temp.equals("2");
				System.out.println(temp);
			}
			else if(temp.equals("three"))
			{
				temp.equals("3");
				System.out.println(temp);
			}
			else if(temp.equals("four"))
			{
				temp.equals("4");
				System.out.println(temp);
			}
			else if(temp.equals("five"))
			{
				temp.equals("5");
				System.out.println(temp);
			}
			else if(temp.equals("six"))
			{
				temp.equals("6");
				System.out.println(temp);
			}
		}
	}
	public void converToString(String temp)
	{
		if(type.equalsIgnoreCase("num"))
		{
			if(temp.equals("1"))
			{
				temp.equals("one");
				System.out.println(temp);
			}
			else if(temp.equals("2"))
			{
				temp.equals("two");
				System.out.println(temp);
			}
			else if(temp.equals("3"))
			{
				temp.equals("three");
				System.out.println(temp);
			}
			else if(temp.equals("4"))
			{
				temp.equals("four");
				System.out.println(temp);
			}
			else if(temp.equals("5"))
			{
				temp.equals("five");
				System.out.println(temp);
			}
			else if(temp.equals("6"))
			{
				temp.equals("six");
				System.out.println(temp);
			}
		}
	}
}
