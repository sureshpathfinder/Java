import java.awt.*;
import java.awt.event.*;
class MenuJay extends Frame implements ActionListener
{
	MenuItem i1, i2, i3;
	Menu f;
	MenuBar mb;
	MenuJay(String s)
	{
		super(s);
		mb = new MenuBar();
		setMenuBar(mb);
		f = new Menu("Color");
		f.add(i1 = new MenuItem("Red"));
		f.add(i2 = new MenuItem("Blue"));
		f.add(i3 = new MenuItem("Green"));
		mb.add(f);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand() == "Red")
		{
			setBackground(Color.RED);

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
		MenuJay m = new MenuJay("MENU DEMO");
		m.setVisible(true);
		m.setSize(600, 600);
	}
}