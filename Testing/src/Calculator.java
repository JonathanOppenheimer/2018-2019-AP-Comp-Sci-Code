import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener 
{
	public static final int WIDTH = 200; 
	public static final int HEIGHT = 125; 
	JLabel additionSymbol;
	JLabel output;
	JTextField numField1;
	JTextField numField2;
	
	public static void main(String[]args)
	{
		Calculator obj = new Calculator();
		obj.setVisible(true);
	}

	public Calculator()
	{
		super();
		setSize(WIDTH,HEIGHT);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel northCanvas = new JPanel();
		{
			numField1 = new JTextField("", 3);
			northCanvas.add(numField1);
			additionSymbol = new JLabel("?");
			northCanvas.add(additionSymbol);
			numField2 = new JTextField("", 3);
			northCanvas.add(numField2);
		}
		add(northCanvas,BorderLayout.NORTH);
		
		JPanel centralCanvas = new JPanel();
		{
			JButton add = new JButton("+");
			add.addActionListener(this);
			centralCanvas.add(add);
			
			JButton minus = new JButton("-");
			minus.addActionListener(this);
			centralCanvas.add(minus);
		}
		add(centralCanvas,BorderLayout.CENTER);
		
		JPanel southCanvas = new JPanel();
		{
			output = new JLabel("...");
			southCanvas.add(output);
		}
		add(southCanvas,BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e)
	{
		String answer = e.getActionCommand();
		int firstNum = Integer.parseInt(numField1.getText());
		int secondNum = Integer.parseInt(numField2.getText());
		int add = firstNum + secondNum; 
		int subtract = firstNum - secondNum; 
		if(answer.equals("+"))
		{
			output.setText(Integer.toString(add));
		}
		if(answer.equals("-"))
		{
			output.setText(Integer.toString(subtract));
		}
	}	
}
