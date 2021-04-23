public class HiddenBallMain 
{
	public static void main(String[]args)
	{
		HiddenBall game = new HiddenBall(4);
		int money = game.getAccount();
		while(money>0)
		{
			game.setHiddenBall();
			game.setGame();
			game.Account();
			System.out.println(game);
			game.getAccount();
		}

	}
}
