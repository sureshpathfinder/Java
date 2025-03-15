import java.awt.event.*;
import java.awt.*;
class JScroll2 extends Frame implements AdjustmentListener
{
	Scrollbar s1,s2,s3;
	Label l1;

	JScroll2(String s)
	{
		super(s);

		s1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		s2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		s3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		l1 = new Label();
		setLayout(null);
		l1.setBounds(50, 50, 300, 30);
		s1.setBounds(0, 400, 500, 30);
		s2.setBounds(0, 450, 500, 30);
		s3.setBounds(0, 500, 500, 30);
		add(s1);
		add(s2);
		add(s3);
		add(l1);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		addWindowListener(new win());
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		if(e.getSource()==s1||e.getSource()==s2||e.getSource()==s3)
		{
			int n1 = s1.getValue(); 
			int n2 = s2.getValue(); 
			int n3 = s3.getValue();
			Color c=new Color(n1,n2,n3);
			setBackground(c);
			l1.setText("scrollbar adjusted position="+n1+","+n2+","+n3);
		}
	}
class win extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }

	public static void main(String args[])
	{
		JScroll2 j = new JScroll2("Scroll Demo");
		j.show();
		j.setSize(600,600);
	}
	
	
}