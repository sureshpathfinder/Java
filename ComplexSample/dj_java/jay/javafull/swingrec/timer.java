import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class timer extends JApplet implements ActionListener
{
	Timer t;
	JButton b1,b2;
	JLabel l;
	Container c;
	int i;
	Color cc[]={Color.red,Color.green,Color.yellow,Color.blue};
	public void init()
	{
		i=0;
		c=getContentPane();
		l=new JLabel("label with timer");
		c.setLayout(new FlowLayout());
		b1=new JButton("start");
		b2=new JButton("stop");
		t=new Timer(1000,this);
		c.add(b1);
		c.add(b2);
		c.add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			t.start();
		else if(e.getSource()==b2)
			t.stop();
		else
		{
			l.setForeground(cc[i]);
			i++;
			if(i==cc.length)
				i=0;
		}
	}
}
//<applet code="timer" width="400" height="400"></applet>