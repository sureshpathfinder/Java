import java.awt.*;
import javax.swing.*;

public class toolbarr extends JFrame
{
	Container c;
	JButton cut,copy, paste;
	JToolBar bar;

	 toolbarr()
	{
		c=getContentPane();
		bar=new JToolBar();
		cut=new JButton(new ImageIcon ("cut.gif"));
		copy=new JButton(new ImageIcon("copy.gif"));
		bar.addSeparator();
		paste=new JButton(new ImageIcon("paste.gif"));
		bar.add(cut);
		bar.add(copy);
		bar.add(paste);
		cut.setToolTipText("cut");
		copy.setToolTipText("copy");
		paste.setToolTipText("paste");
		bar.setMargin(new Insets(15,15,10,10));
		bar.setFloatable(true);
		c.add(bar,"North");
	}
	public static void main(String args[])
	{
		toolbarr t=new toolbarr();
		t.setVisible(true);
		t.setSize(600,600);
	}
}