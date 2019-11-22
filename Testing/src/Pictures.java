import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pictures extends JFrame implements ActionListener
{
	static final int WIDTH = 500;
	static final int HEIGHT = 500;
	
	public static void main(String[]args)
	{
		Pictures obj = new Pictures();
		obj.setVisible(true);
		
	}
	
	public Pictures()
	{
		super("IB Art Show");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel northCanvas = new JPanel();
		{
			northCanvas.setBackground(new Color(0,150,100));
			JLabel welcome = new JLabel("Welcome to the IB art show.");
			northCanvas.add(welcome);
			ImageIcon welcomePic = new ImageIcon("Welcome.jpg");
			JLabel picture = new JLabel(welcomePic);
			northCanvas.add(picture);
		}
		add(northCanvas,BorderLayout.NORTH);
		
		JPanel southCanvas = new JPanel();
		{
			southCanvas.setBackground(new Color(124,23,234));
			ImageIcon byePic = new ImageIcon("harold.jpg");
			JButton exitButton = new JButton("EXIT",byePic);
			exitButton.addActionListener(this);
			southCanvas.add(exitButton);
		}
		add(southCanvas,BorderLayout.SOUTH);

	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String answer = e.getActionCommand();
		if(answer.equals("EXIT"));
		{
			System.exit(0);
		}
	}

}
