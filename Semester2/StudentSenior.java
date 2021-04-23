import java.util.Scanner;

public class StudentSenior extends StudentMason
{
	private String graduationDate;
	private boolean graduationRequire;
	
	public void setGraduationRequire()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Did you take personal finance?");
		String answer = kb.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			graduationRequire = true;
		}
		else
		{
			graduationRequire = false;
		}
	}
	public boolean getGraduationRequire() {
		// TODO Auto-generated method stub
		return graduationRequire;
	}
}
