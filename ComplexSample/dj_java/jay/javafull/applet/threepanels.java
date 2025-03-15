import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class threepanels extends Applet implements ActionListener
{
	CardLayout cl;
	Panel p1,p2,p3;
	Button b1,b2,b3,b4,b5,b6;

	public void init()
	{
		cl = new CardLayout();
		setLayout(cl);
		p1 = new Panel();
		p1.setBackground(Color.yellow);
		p2 = new Panel();
		p2.setBackground(Color.blue);
		p3 = new Panel();
		p3.setBackground(Color.red);
				

		b1 = new Button("1Next");
		b1.addActionListener(this);
		b2 = new Button("2Next");
		b2.addActionListener(this);
 		b3 = new Button("3Next");
		b3.addActionListener(this);
		b4 = new Button("4Next");
		b4.addActionListener(this);
		b5 = new Button("5Next");
		b5.addActionListener(this);
		b6 = new Button("6Next");
		b6.addActionListener(this);



		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		p3.add(b5);
		p3.add(b6);
                add(p1,"1");
                add(p2,"2");
               add(p3,"3");	
		
	}

	public void actionPerformed(ActionEvent e)
	{
                        if(e.getActionCommand().equals("1Next"))
	{
                cl.show(this,"2");
        //cl.next(this);
	}
	else     if(e.getActionCommand().equals("2Next"))
	{
	cl.show(this,"3");
	}
	else      if(e.getActionCommand().equals("3Next"))
	{
                cl.show(this,"1");
	}
	else     if(e.getActionCommand().equals("4Next"))
	{
                cl.show(this,"3");
	}
	else     if(e.getActionCommand().equals("5Next"))
	{
                cl.show(this,"1");
	}
	else     if(e.getActionCommand().equals("6Next"))
	{
                cl.show(this,"2");
	}
}

}
//<applet code=threepanels  width=300 height=300></applet>
