import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class intro1 extends Applet implements ActionListener

	{

		Button b;
		Panel p1,p2;
		public void init()

		{

			b=new Button("click");
			b.addActionListener(this);
			add(b);
		}

	public void actionPerformed(ActionEvent e)

		{
			showStatus("you clicked me");
			setBackground(Color.blue);
		}

	}


/*<applet code = intro1.class width=300 height=300></applet>*/