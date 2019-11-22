import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings({ "deprecation", "serial" })
public class DrawingFirst extends Applet
{
	public void init() 
	{
		setSize(375,375);
		setBackground(Color.green);
	}
	public void start() 
	{
	}
	public void stop() 
	{
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(75, 75, 75, 75);
		g.fillRect(225, 75, 75, 75);
		g.fillRect(150, 150, 75, 112);
		g.fillRect(113, 187, 37, 112);
		g.fillRect(225, 187, 37, 112);
		
	}
}
