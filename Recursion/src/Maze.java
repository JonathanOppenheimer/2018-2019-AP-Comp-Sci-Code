public class Maze 
{
	private final int TRIED = 3;
	private final int PATH = 7;
	private int[][]grid = 
		{{1,1,1,0,1,1,0,0,0,1,1,1,1},
				{1,0,1,1,1,0,1,1,1,1,0,0,1},
				{0,0,0,0,1,0,1,0,1,0,1,0,0},
				{1,1,1,0,1,1,1,0,1,0,1,1,1},
				{1,0,1,0,0,0,0,1,1,1,0,0,1},
				{1,0,1,1,1,1,1,1,0,1,1,1,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1,1,1,1,1}};
	public String toString()
	{
		String result = "\n";
		for(int row =0; row<grid.length; row++)
		{
			for(int column=0; column<grid[row].length; column++)
			{
				result = result + grid[row][column]+"";
			}
			result = result + "\n";
		}
		return result;
	}
	public boolean traverse(int row, int column)
	{
		boolean done = false;
		if(valid(row,column)==true)
		{
			grid[row][column]=TRIED;
			if(row==7 && column ==12)
			{
				done = true;
			}
			else
			{
				done = traverse(row+1, column);
				if(!done==true)
				{
					done=traverse(row, column+1);
				}
				if(!done)
				{
					done = traverse(row-11, column);
				}
				if(!done)
				{
					done = traverse(row, column-1);
				}
				if(!done)
				{
					grid[row][column]=PATH;
				}
			}
		}
		return done;
	}
	public boolean valid(int row, int column)
	{
		boolean result = false;
		if(row>=0 && row <=7 && column>= 0 && column<=12)
		{
			if(grid[row][column]==1)
			{
				result = true;
			}
		}
		return result;
	}
}
