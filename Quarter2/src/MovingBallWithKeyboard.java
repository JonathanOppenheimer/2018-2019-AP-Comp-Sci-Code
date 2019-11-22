import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MovingBallWithKeyboard extends JPanel
{
	int x=200;
	int y=200;
	int vx=1;
	int vy=1;
	int keyNum;
	
	//constructor
	
	public static void main(String[]args) throws InterruptedException
	{
		JFrame frame = new JFrame("Ball Time");
		MovingBallWithKeyboard game = new MovingBallWithKeyboard();
		frame.add(game);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		while(true)
		{
			game.MoveBall();
			game.repaint();
			Thread.sleep(1);
		}
	}
	private void MoveBall() 
	{
		if(keyNum==87)
		{
			vy=-1;
			y=y+vy;
		}
		if(keyNum==68)
		{
			vx=1;
			x=x+vx;
		}
		if(keyNum==65)
		{
			vx=-1;
			x=x+vx;
		}
		if(keyNum==83)
		{
			vy=1;
			y=y+vy;
		}
		if(keyNum==32)
		{
			vy=0;
			vx=0;
		}
	}
	//constructor
	public MovingBallWithKeyboard()
	{
		KeyListener listener = new myKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}
	public class myKeyListener implements KeyListener
	{
		public void keyTyped(KeyEvent e)
		{
			if(x+20>=getWidth()|| x <= 0)
	        {
	            vx=-vx;
	        }
	        if(y+20>=getHeight()|| y <= 0 )
	        {
	            vy=-vy;
	        }
	        x=x+vx;
	        y=y+vy;
		}
		public void keyPressed(KeyEvent e)
		{
			System.out.println("keyPressed=" +KeyEvent.getKeyText(e.getKeyCode())+e.getKeyCode());
			keyNum = e.getKeyCode();
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub	
		}
	}
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		g2d.fillOval(x, y, 30, 30);
	}
}
