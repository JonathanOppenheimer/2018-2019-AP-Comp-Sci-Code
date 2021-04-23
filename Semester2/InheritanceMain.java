public class InheritanceMain extends InheritanceChild
{
	public static void main(String[]args)
	{
		Inheritance doug = new Inheritance();
		doug.setDate();
		Inheritance sally = new Inheritance("SALLY");
		sally.setDate();
		InheritanceChild bill = new InheritanceChild();
		bill.setDate();
	}
}
