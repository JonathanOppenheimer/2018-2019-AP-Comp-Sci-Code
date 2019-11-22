import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class GreenScreen extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 800;
	static final int HEIGHT = 620;
	JButton Apparate;
	JLabel picture1, picture2;
	ImageIcon oilfield, me;
	BufferedImage image1, image2;

	public static void main(String[]args) throws IOException
	{
		GreenScreen obj1 = new GreenScreen();
		obj1.setVisible(true);
	}
	public GreenScreen() throws IOException
	{
		super("GreenScreen 1.0");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel firstPanel = new JPanel();
		{
			File input1 = new File("oilfield.jpg");
			image1 = ImageIO.read(input1);
			oilfield = new ImageIcon("oilfield.jpg");
			picture1 = new JLabel(oilfield);
			firstPanel.add(picture1);
			
			File input2 = new File("me.jpg");
			image2 = ImageIO.read(input2);
			me = new ImageIcon("me.jpg");
			picture2 = new JLabel(me);
			
			Apparate = new JButton("Apparate");
			Apparate.addActionListener(this);
			firstPanel.add(Apparate);
		}
		
		JTabbedPane tabP = new JTabbedPane();
		{
			tabP.addTab("1",firstPanel);
		}
		add(tabP);
	}
	public void actionPerformed(ActionEvent e) 
	{
		String answer = e.getActionCommand();
		answer = e.getActionCommand();
		
		if(answer.equals("Apparate"))
		{
			for(int j = 0; j<picture1.getHeight(); j++)
			{
				for(int i = 0; i<picture1.getWidth(); i++)
				{
					//if(!(me.getRed()<=130 ||me.getRed()>=245))
					Color me = new Color(image2.getRGB(i, j));
					if(!(me.getGreen()>=me.getBlue() && me.getGreen()>=me.getRed()||me.getRed()>=254))
					{	
						image1.setRGB(i, j, image2.getRGB(i, j));
					}
				}
				ImageIcon icon1 = new ImageIcon(image1);
				picture1.setIcon(icon1);
			}
		}	
	}
}
