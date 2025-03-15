import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CardLayoutDemo extends Applet implements ActionListener
{
	CardLayout cl;
	Panel p1,p2;
	Button b1,b2;

	public void init()
	{
		cl = new CardLayout();
		setLayout(cl);
		p1 = new Panel();
		p1.setBackground(Color.yellow);
		p2 = new Panel();
		p2.setBackground(Color.blue);

		b1 = new Button("1Next");
		b1.addActionListener(this);
		b2 = new Button("2Next");
		b2.addActionListener(this);
		
		p1.add(b1);
		p2.add(b2);
		
                add(p1,"1");
                add(p2,"2");
		
	}

	public void actionPerformed(ActionEvent e)
	{
                        if(e.getActionCommand().equals("1Next"))
	{
                cl.show(this,"2");
        //cl.next(this);
	}
	else
	{
	cl.previous(this);
	}

	}
}
//<applet code=CardLayoutDemo width=300 height=300></applet>
