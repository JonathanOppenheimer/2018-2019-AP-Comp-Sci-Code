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

public class ImageEditor extends JFrame implements ActionListener
{
	static final int WIDTH = 500;
	static final int HEIGHT = 470;
	JButton exitButton, redButton, greenButton, blueButton, greyButton;
	JLabel picture1, picture2, picture3, picture4;
	ImageIcon volcano, forest, ocean, baseball;
	BufferedImage image1, image2, image3, image4;

	public static void main(String[]args) throws IOException
	{
		ImageEditor obj1 = new ImageEditor();
		obj1.setVisible(true);
	}
	public ImageEditor() throws IOException
	{
		super("Image Editor 1.0");
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
			
			redButton = new JButton("RED");
			redButton.addActionListener(this);
			firstPanel.add(redButton);

		}
		JPanel secondPanel = new JPanel();
		{
			File input = new File("forest.jpg");
			image2 = ImageIO.read(input);
			forest = new ImageIcon("forest.jpg");
			picture2 = new JLabel(forest);
			secondPanel.add(picture2);
			
			greenButton = new JButton("GREEN");
			greenButton.addActionListener(this);
			secondPanel.add(greenButton);

		}
		JPanel thirdPanel = new JPanel();
		{
			File input = new File("ocean.jpg");
			image3 = ImageIO.read(input);
			ocean = new ImageIcon("ocean.jpg");
			picture3 = new JLabel(ocean);
			thirdPanel.add(picture3);
			
			blueButton = new JButton("BLUE");
			blueButton.addActionListener(this);
			thirdPanel.add(blueButton);

		}
		JPanel fourthPanel = new JPanel();
		{
			File input = new File("baseball.jpg");
			image4 = ImageIO.read(input);
			ocean = new ImageIcon("baseball.jpg");
			picture4 = new JLabel(ocean);
			fourthPanel.add(picture4);
			
			greyButton = new JButton("GREY");
			greyButton.addActionListener(this);
			fourthPanel.add(greyButton);
		}
		JTabbedPane tabP = new JTabbedPane();
		{
			tabP.addTab("First",firstPanel);
			tabP.addTab("Second",secondPanel);
			tabP.addTab("Third",thirdPanel);
			tabP.addTab("Fourth",fourthPanel);
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

		else if(answer.equals("RED"))
		{
			for(int j = 0; j<picture1.getHeight(); j++)
			{
				for(int i = 0; i<picture1.getWidth(); i++)
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
				picture1.setIcon(icon2);
			}
		}
		else if(answer.equals("GREEN"))
		{
			for(int j = 0; j<picture2.getHeight(); j++)
			{
				for(int i = 0; i<picture2.getWidth(); i++)
				{
					Color original = new Color(image2.getRGB(i, j));
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
					image2.setRGB(i, j, newOriginal.getRGB());
				}
				ImageIcon icon2 = new ImageIcon(image2);
				picture2.setIcon(icon2);
			}
		}	
		else if(answer.equals("BLUE"))
		{
			for(int j = 0; j<picture3.getHeight(); j++)
			{
				for(int i = 0; i<picture3.getWidth(); i++)
				{
					Color original = new Color(image3.getRGB(i, j));
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
					image3.setRGB(i, j, newOriginal.getRGB());
				}
				ImageIcon icon2 = new ImageIcon(image3);
				picture3.setIcon(icon2);
			}
		}	
		else if(answer.equals("GREY"))
		{
			for(int j = 0; j<picture4.getHeight(); j++)
			{
				for(int i = 0; i<picture4.getWidth(); i++)
				{
					Color original = new Color(image4.getRGB(i, j));
					int red = original.getRed();
					int blue = original.getBlue();
					int green = original.getGreen();
					
					int total = ((red + green + blue)/3); 
					red = total;
					green = total;
					blue = total;
					Color newOriginal = new Color(red, green, blue);
					image4.setRGB(i, j, newOriginal.getRGB());
				}
				ImageIcon icon2 = new ImageIcon(image4);
				picture4.setIcon(icon2);
			}
		}	
	}
}
