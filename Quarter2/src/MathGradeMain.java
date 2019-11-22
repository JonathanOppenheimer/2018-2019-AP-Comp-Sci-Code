
public class MathGradeMain 
{
	//global variables
	public static void main(String[]args)
	{
		int classSize = 30;
		//make an instance of them math grade
		//class size is in the parameter
		MathGrade objA = new MathGrade(classSize);
		objA.randomGradeGenerator();
		objA.choiceGrade();
	}
}
