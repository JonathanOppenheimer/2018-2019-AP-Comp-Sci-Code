import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI3 extends JFrame implements ActionListener 
{
	public static final int WIDTH = 200; 
	public static final int HEIGHT = 150; 
	JTextField numberField;
	JLabel printOut;

	public static void main(String[]args)
	{
		GUI3 obj = new GUI3();
		obj.setVisible(true);
	}

	public GUI3()
	{
		super();
		setSize(WIDTH,HEIGHT);
		setTitle("Prime Machine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		numberField = new JTextField("Enter in a number", 10);
		add(numberField);
		JButton create = new JButton("Check");
		create.addActionListener(this);
		add(create);
		printOut = new JLabel("waiting...");
		add(printOut);
	}
	public void actionPerformed(ActionEvent e)
	{
		String answer = e.getActionCommand();
		if(answer.equals("Check"))
		{
			int temp = Integer.parseInt(numberField.getText());
			boolean check = false;

			if(temp<0)
			{
				check = true;
			}
			for(int i=2; i<temp-1; i++)
			{
				if(temp%i==0)
				{
					check = true;
				}
				if(temp<0)
				{
					check = true;
				}
			}

			if(check == true)
			{
				printOut.setText(temp + " is not prime.");
			}
			if(check == false)
			{
				printOut.setText(temp + " is prime.");
			}
		}
	}

}
