import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuJaySwing extends JFrame implements ActionListener
{
	JMenuItem i1, i2, i3;
	JMenu f;
	JMenuBar mb;
	MenuJaySwing(String s)
	{
		super(s);
		mb = new JMenuBar();
		setJMenuBar(mb);
		f = new JMenu("Color");
		f.add(i1 = new JMenuItem("Red"));
		f.add(i2 = new JMenuItem("Blue"));
		f.add(i3 = new JMenuItem("Green"));
		mb.add(f);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand() == "Red")
		{
			JScroll2 j=new JScroll2("HELLO");
			j.setSize(700,700);
			j.show();

		}
		if (e.getActionCommand() == "Blue")
		{
			setBackground(Color.BLUE);
		}
		if (e.getActionCommand() == "Green")
		{
			setBackground(Color.GREEN);
		}
	}
	public static void main(String args[])
	{
		MenuJaySwing m = new MenuJaySwing("MENU DEMO");
		m.setVisible(true);
		m.setSize(600, 600);
	}
}