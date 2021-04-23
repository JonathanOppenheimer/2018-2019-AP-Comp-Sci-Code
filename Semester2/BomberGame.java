import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BomberGame extends JPanel 
{
	//keyboard tracking
	int keyNum;
	//Bin
	int xBin = 375;
	int yBin = 530; 
	int vxBin = -1;
	//Bomber
	int xBomber = 375;
	int yBomber = 25; 
	int vxBomber = 1;
	//Bombs
	private int BombX = 100;
	private int BombY = 80;
	//score board
	private int ScoreCounter = 0;
	public static void main(String[]args) throws InterruptedException
	{
		JFrame frame = new JFrame("BomberGame");
		BomberGame game = new BomberGame();
		frame.add(game);
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		while(true)
		{
			game.Bomber();
			game.Bins();
			game.Bombs();
			game.Collosion();
			game.repaint();
			Thread.sleep(3);
		}
	}
	public BomberGame()
	{
		//mouse implementation
		MouseListener listener = new myMouseListener();
		addMouseListener(listener);
		setFocusable(true);
	}
	public class myMouseListener implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private void Bomber()
	{
		if(xBomber+50>=getWidth()|| xBomber <= 0)
        {
            vxBomber=-vxBomber;
        }
        xBomber=xBomber+vxBomber;
        int random = (int)(Math.random()*150);
        if(random==25)
        {
        	vxBomber=-vxBomber;
        }
	}
	public void Bins()
	{
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int xc = (int)b.getX();
		System.out.println(xc);
		xBin = xc;
		
	}
	public void Bombs()
	{
		BombY++;
		if(BombY<=100)
		{
			BombX = xBomber;
		}
		if(BombY>getHeight())
		{
			BombY=yBomber+50;
		}
	}
	public void Collosion()
	{
		//left side of the bomb > left side of the catch
		//right side of the bomb < right side of the catcher
		if(BombX>=xBin && (BombX + 20)<=(xBin+50))
		{
			if(yBin<=BombY+10)
			{
			ScoreCounter++;
			System.out.println(ScoreCounter);
			BombY=yBomber;
			}
		}
	}
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		//background
		g2d.setColor(new Color(34,139,34));
		g2d.fillRect(0, 0, (getWidth()), (getHeight()));
		g2d.setColor(Color.gray);
		g2d.fillRect(0, 0, 800, 100);
		//Bombs
		g.setColor(Color.BLACK);
		g.fillOval(BombX, BombY, 20, 20);
		//Bins
		g2d.setColor(Color.BLUE);
		g2d.fillRect(xBin, yBin, 60, 50);	
		//Bomber
		g2d.setColor(Color.BLUE);
		g2d.fillRect(xBomber, yBomber, 50, 75);
		//Score board
		g.setFont(new Font("Times Roman",Font.BOLD,24));
		g.drawString("Score " + ScoreCounter, 600, 20);
	}
}
