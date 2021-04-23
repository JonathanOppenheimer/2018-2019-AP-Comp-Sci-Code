public class TicTacToeMain 
{
	public static void main(String[]args)
	{
		TicTacToe object = new TicTacToe();
		int runner = 1;
		object.clearer();
		while(runner == 1)
		{
			object.fillBoard();
			object.printBoard();
			object.checkBoard(runner, "X");
			object.checkBoard(runner, "O");
		}
	}
}
