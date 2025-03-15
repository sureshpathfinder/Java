import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class check extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	TextField t1;
	public void init()
	{
		t1 = new TextField(25);
		c1 = new Checkbox("Vanilla");
		c2 = new Checkbox("Pistha");	
		c3 = new Checkbox("Chocolate");
		add(t1);	
		add(c1);	
		add(c2);	
		add(c3);			
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			t1.setText(c1.getLabel());
		}
		else if(ie.getSource()==c2)
		{
			t1.setText(c2.getLabel());
		}
		else if(ie.getSource()==c3)
		{
			t1.setText(c3.getLabel());
		}
	}
}
	
//<applet code=check width=400 height=400></applet>	
		
