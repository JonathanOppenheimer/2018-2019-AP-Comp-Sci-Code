import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI1 extends JFrame
{
	public static final int WIDTH = 300; 
	public static final int HEIGHT = 200; 
	public static void main(String[]args)
	{
		GUI1 obj = new GUI1();
		obj.setVisible(true);
	}
	public GUI1()
	{
		super();
		setSize(WIDTH,HEIGHT);
		setTitle("GUI ONE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JLabel nameLabel = new JLabel("Sexuality Machine");
		add(nameLabel);
		JLabel ageLabel = new JLabel("Setting: Gay");
		add(ageLabel);
		JTextField sentence = new JTextField("Enter in the subject's name.", 20);
		sentence.setBackground(new Color(200,121,100));
		add(sentence);
		JTextArea paragraph = new JTextArea(2,10);
		add(paragraph);
		JButton button1 = new JButton("Run");
		add(button1);
	}
}
