import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MovingBall extends JPanel
{
	int w = 0;
	int q = 0;
	int x = 50;
    int y = 50;
    int vy = 1;
    int vx = 1;
    int counter = 0;
    public static void main(String[]args) throws InterruptedException
    {
    	
        JFrame frame = new JFrame("Moving ball");
        MovingBall game = new MovingBall();
        frame.add(game);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true)
        {
            game.moveBall();
            game.repaint();
            Thread.sleep(3);
        }
    }
    private void moveBall() 
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
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(105,22,253));
        g2d.fillRect(0, 0, 1368, 768);
        g2d.setColor(Color.BLACK);
        g.fillOval(x, y, 20, 20);
    }
}