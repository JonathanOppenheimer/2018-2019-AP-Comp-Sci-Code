import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BorderAreas extends JFrame 
{
	private static final int WIDTH = 500;
	private static final int HEIGHT = 200;
	public static void main(String[]args)
	{
		BorderAreas obj = new BorderAreas();
		obj.setVisible(true);

	}
	public BorderAreas()
	{
		super("Border Areas");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel northCanvas = new JPanel();
		{
			JButton click = new JButton("DAB");
			northCanvas.add(click);
			JLabel clickLabel = new JLabel("makes Finn Driggers dab");
			northCanvas.add(clickLabel);
		}
		add(northCanvas,BorderLayout.NORTH);
		JPanel southCanvas = new JPanel();
		{
			southCanvas.setBackground(new Color(34,51,172));
		}
		add(southCanvas,BorderLayout.SOUTH);
	}
}
