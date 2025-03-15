import java.awt.event.*;
import java.awt.*;
class JScroll extends Frame implements AdjustmentListener
{
	Scrollbar s1;
	Label l1;
	
	JScroll()
	{
		
		s1 = new Scrollbar(Scrollbar.HORIZONTAL, 10, 10, 0, 255);
		l1 = new Label();
		setLayout(null);
		l1.setBounds(50, 50, 300, 30);
		s1.setBounds(0, 400, 500, 50);
		add(s1);
		add(l1);
		s1.addAdjustmentListener(this);

	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		if(e.getSource()==s1)
		{
			int n=s1.getValue();
			l1.setText("scrollbar adjusted position="+n);
		}
	}
	public static void main(String args[])
	{
		JScroll j = new JScroll();
		j.show();
		j.setSize(500, 500);
	}
	
	
}