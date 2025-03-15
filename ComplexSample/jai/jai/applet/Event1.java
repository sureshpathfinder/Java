import java.awt.*;
import java.awt.event.*;
public class Event1 extends Frame implements ActionListener
{
	Button b1, b2;
	Label l1 = new Label();
	Event1()
	{
		setLayout(null);
		b1 = new Button("Button One");
		b2 = new Button("Button Two");
		l1.setBounds(100,15,200,30);
		b1.setBounds(10,60,140,20);
		b2.setBounds(190,60,140,20);
		add(l1);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.g
