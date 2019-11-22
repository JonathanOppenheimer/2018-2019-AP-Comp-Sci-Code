import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawingAgain extends JPanel 
{
	public static void main(String[]args) 
	{
		//JFrame is the class and the frame is the object
		JFrame frame = new JFrame("Title goes here.");
		//The object(frame) wants to go to the method add 
		frame.setBackground(Color.red);
		frame.add(new DrawingAgain());
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//A void method called paint - argument Graphics g
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
	
		g.setColor(Color.WHITE);
		g2d.fillOval(100, 100, 175, 175);
		int [] xPoints = {4*5 + 200,1*5+ 200,3*5+ 200,2*5+ 200,5*5+ 200,8*5+ 200,7*5+ 200,9*5+ 200,6*5+ 200,5*5+ 200};
		int [] yPoints = {6*5+ 162,6*5+ 162,4*5+ 162,1*5+ 162,3*5+ 162,1*5+ 162,4*5+ 162,6*5+ 162,6*5+ 162,9*5+ 162};
		g.setColor(Color.RED);
		g2d.fillOval(150, 112, 150, 150);
		g.setColor(Color.WHITE);
		g2d.fillPolygon(xPoints, yPoints, 10);

	}
}
