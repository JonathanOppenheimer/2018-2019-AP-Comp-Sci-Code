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


@SuppressWarnings("serial")
public class Avengers extends JFrame implements ActionListener
{
	static final int WIDTH = 500;
	static final int HEIGHT = 480;
	JButton exitButton, redButton, greenButton, blueButton;
	JLabel picture;
	ImageIcon avengers;
	BufferedImage image1;

	public static void main(String[]args) throws IOException
	{
		Avengers obj = new Avengers();
		obj.setVisible(true);

	}
	public Avengers() throws IOException
	{
		super("Avengers");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel northCanvas = new JPanel();
		{
			northCanvas.setBackground(new Color(124,23,234));

			File input = new File("Avengers.jpg");
			image1 = ImageIO.read(input);

			JLabel welcome = new JLabel("Welcome to Avengers");
			northCanvas.add(welcome);
			avengers = new ImageIcon("Avengers.jpg");
			picture = new JLabel(avengers);
			northCanvas.add(picture);
		}
		add(northCanvas,BorderLayout.NORTH);

		JPanel southCanvas = new JPanel();
		{
			redButton = new JButton("RED");
			redButton.addActionListener(this);
			southCanvas.add(redButton);
		
			greenButton = new JButton("GREEN");
			greenButton.addActionListener(this);
			southCanvas.add(greenButton);
			
			blueButton = new JButton("BLUE");
			blueButton.addActionListener(this);
			southCanvas.add(blueButton);

			southCanvas.setBackground(new Color(124,23,234));
			exitButton = new JButton("EXIT");
			exitButton.addActionListener(this);
			southCanvas.add(exitButton);			
		}
		add(southCanvas,BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) 
	{
		String answer = e.getActionCommand();
		answer = e.getActionCommand();
		if(answer.equals("EXIT"))
		{
			System.exit(0);
		}

		else if(answer.equals("RED"))
		{
			for(int j = 0; j<picture.getHeight(); j++)
			{
				for(int i = 0; i<picture.getWidth(); i++)
				{
					Color original = new Color(image1.getRGB(i, j));
					int red = original.getRed();
					int blue = original.getBlue();
					int green = original.getGreen();
					if(red+75>255)
					{
						red=255;
					}
					else
					{
						red+=75;
					}
					Color newOriginal = new Color(red, green, blue);
					image1.setRGB(i, j, newOriginal.getRGB());
				}
				ImageIcon icon2 = new ImageIcon(image1);
				picture.setIcon(icon2);
			}
		}

		else if(answer.equals("BLUE"))
		{
			for(int j = 0; j<picture.getHeight(); j++)
			{
				for(int i = 0; i<picture.getWidth(); i++)
				{
					Color original = new Color(image1.getRGB(i, j));
					int red = original.getRed();
					int blue = original.getBlue();
					int green = original.getGreen();
					if(blue+75>255)
					{
						blue=255;
					}
					else
					{
						blue+=75;
					}
					Color newOriginal = new Color(red, green, blue);
					image1.setRGB(i, j, newOriginal.getRGB());
				}
				ImageIcon icon2 = new ImageIcon(image1);
				picture.setIcon(icon2);
			}
		}	
		else if(answer.equals("GREEN"))
		{
			for(int j = 0; j<picture.getHeight(); j++)
			{
				for(int i = 0; i<picture.getWidth(); i++)
				{
					Color original = new Color(image1.getRGB(i, j));
					int red = original.getRed();
					int blue = original.getBlue();
					int green = original.getGreen();
					if(green+75>255)
					{
						green=255;
					}
					else
					{
						green+=75;
					}
					
					Color newOriginal = new Color(red, green, blue);
					image1.setRGB(i, j, newOriginal.getRGB());
				}
				ImageIcon icon2 = new ImageIcon(image1);
				picture.setIcon(icon2);
			}
		}	
	}
}
