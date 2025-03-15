import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class progmonitor1 extends JFrame implements ActionListener
{
	Container c;
        JPanel p;
        JButton b1,b2;
        ProgressMonitor prg;
        Timer t;
        int count;
	public progmonitor1()
	{
		c=getContentPane();
		p=new JPanel();
		b1=new JButton("start");
		b2=new JButton("stop");
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
		t=new Timer(1000,this);
		c.add(p,"South");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			prg=new ProgressMonitor(c,"I am Progress Monitor","note",0,20);
			t.start();
		}
		else if(e.getSource()==b2)
		{
			t.stop();
			count=0;
		}
		else if(e.getSource()==t)
		{  
			if(count>20)
				t.stop();
			else
			{
				prg.setProgress(count);
				prg.setNote("Current value of count is"+count);
			}
			count++;
		}
	}
	public static void main(String args[])
	{
		progmonitor1 p=new progmonitor1();
		p.setVisible(true);
		p.setSize(400,400);
	}
}
