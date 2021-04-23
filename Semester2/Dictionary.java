public class Dictionary extends book 
{
	private int definitions = 52500;
	public Dictionary(int pages, int defs)
	{
		super(pages);
		definitions = defs;
	}
	public void definitionMessage()
	{
		System.out.println("Numer of definitions: " + definitions);
		System.out.println("The number of definitions per pages: " + (definitions/pages));
	}
}
