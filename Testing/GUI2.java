import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI2 extends JFrame implements ActionListener 
{
	public static final int WIDTH = 200; 
	public static final int HEIGHT = 150; 
	JLabel username;
	JLabel password;
	JTextField nameField;
	JTextField ageField;
	
	public static void main(String[]args)
	{
		GUI2 obj = new GUI2();
		obj.setVisible(true);
	}

	public GUI2()
	{
		super();
		setSize(WIDTH,HEIGHT);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		nameField = new JTextField("Enter in name:", 10);
		add(nameField);
		ageField = new JTextField("Enter in age:", 10);
		add(ageField);
		username = new JLabel("Username:");
		add(username);
		password = new JLabel("Password:");
		add(password);
		JButton create = new JButton("Create");
		create.addActionListener(this);
		add(create);
	}
	public void actionPerformed(ActionEvent e)
	{
		String answer = e.getActionCommand();
		if(answer.equals("Create"))
		{
			String temp = nameField.getText();
			String nameBackwards = "";
			for(int i=temp.length()-1; i>=0; i--)
			{
				nameBackwards = nameBackwards + temp.charAt(i);
			}
			username.setText("Username: " + nameField.getText() + ageField.getText());
			password.setText("Password: " + nameBackwards);
		}
	}
		
}
