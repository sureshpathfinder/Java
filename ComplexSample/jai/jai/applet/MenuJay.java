import java.awt.*;
import java.awt.event.*;
class MenuJay extends Frame implements ActionListener
{
	MenuItem i1, i2, i3,j1;
	Menu f,f1;
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
            		setMenuBar(mb);
		f1= new Menu("file");
		f1.add(j1 = new MenuItem("open"));
		mb.add(f1);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
  		j1.addActionListener(this);
		
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
		if (e.getActionCommand() == "open")
		{
			JScroll2 j=new JScroll2("COLOR");
			j.setVisible(true);
			j.setSize(600, 600);
		}
	}
	public static void main(String args[])
	{
		MenuJay m = new MenuJay("MENU DEMO");
		m.setVisible(true);
		m.setSize(600, 600);
		
	}
	
}