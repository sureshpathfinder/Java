import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class radio extends Applet implements ItemListener
{
	TextField t1;
	Checkbox c1,c2;
	CheckboxGroup cbg;
	public void init()
	{
		cbg = new CheckboxGroup();
	c1 = new Checkbox("Male",true,cbg);
	c2 = new Checkbox("Female",false,cbg);
		t1 = new TextField(15);
		add(c1);
		add(c2);
		add(t1);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			t1.setText(c1.getLabel());
		}
		else
		{
			t1.setText(c2.getLabel());
		}
	}
}

//<applet code=radio width=400 height=400></applet>	