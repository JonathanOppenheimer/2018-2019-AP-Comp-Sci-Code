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

public class FlipperMachine extends JFrame implements ActionListener
{
	static final int WIDTH = 500;
	static final int HEIGHT = 470;
	JButton exitButton, horizantalButton, verticalButton;
	JLabel picture1, picture2;
	ImageIcon volcano, forest;
	BufferedImage image1, image2;

	public static void main(String[]args) throws IOException
	{
		FlipperMachine obj1 = new FlipperMachine();
		obj1.setVisible(true);
	}
	public FlipperMachine() throws IOException
	{
		super("Image Flipper 1.0");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel firstPanel = new JPanel();
		{
			File input = new File("volcano.jpg");
			image1 = ImageIO.read(input);
			volcano = new ImageIcon("volcano.jpg");
			picture1 = new JLabel(volcano);
			firstPanel.add(picture1);
			
			horizantalButton = new JButton("HFLIP");
			horizantalButton.addActionListener(this);
			firstPanel.add(horizantalButton);

		}
		JPanel secondPanel = new JPanel();
		{
			File input = new File("forest.jpg");
			image2 = ImageIO.read(input);
			forest = new ImageIcon("forest.jpg");
			picture2 = new JLabel(forest);
			secondPanel.add(picture2);
			
			verticalButton = new JButton("VFLIP");
			verticalButton.addActionListener(this);
			secondPanel.add(verticalButton);

		}
		
		JTabbedPane tabP = new JTabbedPane();
		{
			tabP.addTab("Horizantal",firstPanel);
			tabP.addTab("Vertical",secondPanel);
		}
		add(tabP);
	}
	public void actionPerformed(ActionEvent e) 
	{
		String answer = e.getActionCommand();
		answer = e.getActionCommand();

		if(answer.equals("EXIT"))
		{
			System.exit(0);
		}

		else if(answer.equals("HFLIP"))
		{
			for(int j = 0; j<picture1.getHeight(); j++)
			{
				for(int i = 0; i<picture1.getWidth() / 2; i++)
				{
					Color original = new Color(image1.getRGB(i, j));
					image1.setRGB(-i+(image1.getWidth()) - 1, j, original.getRGB());
				}
				ImageIcon icon1 = new ImageIcon(image1);
				picture1.setIcon(icon1);
			}
		}
		else if(answer.equals("VFLIP"))
		{
			for(int j = 0; j<picture2.getHeight() / 2; j++)
			{
				for(int i = 0; i<picture2.getWidth(); i++)
				{
					Color og = new Color(image2.getRGB(i, j));
					image2.setRGB(i, -j+(image2.getHeight()) - 1, og.getRGB());
				}
				ImageIcon icon2 = new ImageIcon(image2);
				picture2.setIcon(icon2);
			}
		}	
	}
}
