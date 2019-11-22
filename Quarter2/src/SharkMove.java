import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SharkMove extends JPanel
{
	//shark
	static int x = 0;
	static int y = 250;
	int vx = 1;
	int vy = 1;
	int keyNum;
	static int check = 1;
	//line
	static int line = 0;
	static int lineLength = 100;
	int vLine = -1;
	//board
	int score = 0;
	int lives = 1;
	//prey
	static int r = 50;
    static int t = 50;
    int vt = 1;
    int vr = 1;
	public static void main(String[]args) throws InterruptedException
	{
		JFrame frame = new JFrame("SharkTime");
		SharkMove game = new SharkMove();
		frame.add(game);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		while(true)
		{
			game.moveShark(check);
			game.movePrey();
			game.moveLine();
			game.repaint();
			game.hitDetection(x,r,y,t,line,lineLength);
			Thread.sleep(3);
		}
	}

	//constructor
	public SharkMove()
	{
		KeyListener listener = new myKeyListener();
		addKeyListener(listener);
		setFocusable(true);
		}
		public class myKeyListener implements KeyListener
		{
		public void keyTyped(KeyEvent e)
		{
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
	private void movePrey()
	{
		 if(r+20>=getWidth()|| r <= 0)
	        {
	            vr=-vr;
	        }
	        if(t+20>=getHeight()|| t <= 0 )
	        {
	            vt=-vt;
	        }
	        r=r+vr;
	        t=t+vt;
	}
	private void moveLine()
	{
		lineLength=lineLength+vLine;
		if(lineLength<5) 
		{
			vLine = 1;
		}
		if(lineLength>getWidth()+5)
		{
			vLine = -1;
		}
	}
	private void moveShark(int check) 
	{
		if(check==1) {
		x=x+1;
		if(x==getHeight())
		{
			x=-1;
		}
		if(y==getHeight())
		{
			y=-1;
		}
		if(y==0)
		{
			vy=-1;
		}
		if(keyNum==87)
		{
			vy=-1;
			y=y+vy;
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
	}
	public void hitDetection(int x,int r, int y, int t, int line, int lineLength)
	{
		if((x >= r && x <= r + 50) && (y >= t && y <= t + 50))
		{
			score=score+1;
		}
		if(((x >= line && x <= line + 50) && (y >= lineLength && y <= lineLength + 50)))
		{
			lives=0;
			vx=0;
			vy=0;
			check=0;
			x=lineLength;
		}
	}
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		//background
		g2d.setColor(new Color(105,22,253));
		g2d.fillRect(0, 0, (getWidth()*2), (getHeight()*2));
		//shark
		g.setColor(Color.BLACK);
		int w=y;
		int [] xPoints = {(5*0)+x, (5*3)+x, (5*6)+x, (5*9)+x, (5*7)+x, (5*9)+x, (5*6)+x, (5*3)+x, (5*0)+x, (5*2)+x};
		int [] yPoints = {(5*0)+w, (5*2)+w, (5*0)+w, (5*2)+w, (5*3)+w, (5*4)+w, (5*6)+w, (5*4)+w, (5*6)+w, (5*3)+w};
		g2d.fillPolygon(xPoints, yPoints, 10);
		//fishing line
		g2d.fillRect(450, line, 5, lineLength);
		//prey
		g2d.fillRect(r, t, 10, 10);
		//score board 
		g2d.setFont(new Font("TimesRoman",Font.BOLD,18));
		g2d.drawString("Score: " + score + " Lives: " + lives, 20, 20);
		if(check==0)
		{
			g2d.setColor(Color.BLACK);
			g2d.fillRect(0, 0, (getWidth()*2), (getHeight()*2));
			g2d.setFont(new Font("TimesRoman",Font.BOLD,18));
			g2d.setColor(Color.white);
			g2d.drawString("You lost.", 220, 250); 
		}
		
	}
}
