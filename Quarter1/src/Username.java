	/* last name -> less than 3 characters add extra characters between 2nd and 3rd characters
	 * far--> faweather
	 * last name -> more than 3 charcters, switch the halves
	 * Desk -> skDe
	 * add a random two digit number on the end */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Username 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String lastName = JOptionPane.showInputDialog("Please enter in" + "in your last name");
		int nameLength = lastName.length();
		if(nameLength<=3)
		{
			String ran = "biggay";
			String userName = "" + lastName.charAt(0) + lastName.charAt(1) + ran + lastName.charAt(nameLength - 1);
			System.out.println(userName);
		}
		else if(nameLength>3)
		{
		System.out.println(lastName);
		}
		kb.close();
	}
}
