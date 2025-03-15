import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class list extends Applet implements ItemListener
{
	List li1;
	TextArea t1;
	public void init()
	{
		t1 = new TextArea(10,25);
		li1 = new List(3,true);
		li1.addItem("Hindu");
		li1.addItem("IndianExpress");
		li1.addItem("DeccanHerald");
		li1.addItem("Times of India");		
		add(t1);
		add(li1);
		li1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String  aa[ ] = li1.getSelectedItems( );
		for(int i=0;i<aa.length;i++)
		t1.appendText(aa[i]+"\n");
	
	}
}

//<applet code=list width=400 height=400></applet>