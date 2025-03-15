import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="intro2.class"  width=300  height=300> </applet>*/

public class intro2 extends Applet 

	{
		
		Button b1,b2,b3,b4;

		Panel p1,p2;

		public void init()
		{
			setLayout(new GridLayout(1,2,50,50));
			b1=new Button("button1");							b2=new Button("button2");
			b3=new Button("button3");  			
			b4=new Button("button4");
			p1=new Panel();
			p2=new Panel();
			p1.add(b1);
			p1.add(b2);
			p2.add(b3);
			p2.add(b4);
			p1.setBackground(Color.blue);
			p2.setBackground(Color.green);
			p1.setLayout(new GridLayout(1,2,50,50));
			add(p1);
			add(p2);


	}

}

