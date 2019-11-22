public class StudentMasonMain 
{
	public static void main(String[]args)
	{
		StudentMason student1 = new StudentMason();
		StudentMason student2 = new StudentMason(123654,"Fluffy Dog");
		StudentSenior student3 = new StudentSenior();
		System.out.println(student1.getName());
		System.out.println(student1.getID());
		System.out.println(student2.getName());
		System.out.println(student2.getID());
		student3.setGraduationRequire();
		System.out.println(student3.getName());
		System.out.println(student3.getID());
		System.out.println(student3.getGraduationRequire());
	}
}
