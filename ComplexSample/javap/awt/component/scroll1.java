import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class scroll1 extends Applet implements AdjustmentListener
{
	Scrollbar sb1,sb2;
	TextField t1;
	public void init()
	{
		t1 = new TextField(15);
		sb1 = new Scrollbar(Scrollbar.HORIZONTAL,1,30,1,80);
		add(sb1);
		sb2 = new Scrollbar(Scrollbar.VERTICAL,1,30,1,100);
		add(sb2);
		add(t1);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
if(ae.getSource()==sb1 || ae.getSource()==sb2)
		{
t1.setText("Hor :"+sb1.getValue()+"Ver :"+sb2.getValue());
		}
	}
}

//<applet code=scroll width=400 height=400></applet>