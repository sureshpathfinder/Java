import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class choice extends Applet implements ItemListener
{
	Choice c1;
	TextField t1;
	public void init()
	{
		t1 = new TextField(10);
		c1 = new Choice();
		c1.addItem("Hindu");
		c1.addItem("IndianExpress");
		c1.addItem("DeccanHerald");
		c1.addItem("Times of India");		
		add(c1);
		add(t1);
		c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		t1.setText(c1.getSelectedItem());
	}
}

//<applet code=choice width=400 height=400></applet>