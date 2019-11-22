public class MazeDriver 
{
	public static void main(String[]args)
	{
		Maze object = new Maze();
		System.out.println(object);
		object.traverse(0, 0);
		System.out.println(object);
	}

}
