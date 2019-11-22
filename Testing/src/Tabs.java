import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Tabs extends JFrame implements ActionListener
{
	private JTextField nameF;
	private JLabel answerLabel;
	JButton helloButton;

	public static void main(String[]args)
	{
		Tabs obj1 = new Tabs();
		obj1.setVisible(true);
	}
	public Tabs()
	{
		super("Tabs");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel firstPanel = new JPanel();
		{
			JLabel nameL = new JLabel("Enter in your last name.");
			firstPanel.add(nameL);
			nameF = new JTextField("Enter in your first name",8);
			firstPanel.add(nameF);
		}
		JPanel secondPanel = new JPanel();
		{
			helloButton = new JButton("Hello");
			secondPanel.add(helloButton);
			ImageIcon helloPic = new ImageIcon("hello.png");
			helloButton.addActionListener(this);
			JLabel picLabel =  new JLabel(helloPic);
			secondPanel.add(picLabel);			
		}
		JPanel thirdPanel = new JPanel();
		{
			answerLabel = new JLabel("Soccer wil miss miles and nick.");
			thirdPanel.add(answerLabel);
		}
		JTabbedPane tabP = new JTabbedPane();
		{
			tabP.addTab("First",firstPanel);
			tabP.addTab("Second",secondPanel);
			tabP.addTab("Third",thirdPanel);
		}
		add(tabP);
	}
	public void actionPerformed(ActionEvent e) 
	{
		String answer = e.getActionCommand();
		if(answer.equals("Hello"));
		{
			String name = nameF.getText();
			helloButton.setEnabled(false);
			answerLabel.setText("Soccer will miss " + name + ".");
		}
	}
}
