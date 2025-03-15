import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

/*
<APPLET
    CODE=kar.class
    WIDTH=210
    HEIGHT=200 >
</APPLET>
*/
public class kar extends JApplet implements ItemListener
{
	
    Container c;
    JRadioButton b1 = new JRadioButton("Metal"),
    b2 = new JRadioButton("Motif"),
    b3 = new JRadioButton("Windows");
        JButton b=new JButton("Karthik");
	public void init()
	{	
               c=getContentPane();
                c.setLayout(new FlowLayout());
UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            ButtonGroup group = new ButtonGroup();
            group.add(b1);
            group.add(b2);
            group.add(b3);
                c.add(b);
	            b1.addItemListener(this);
            b2.addItemListener(this);
            b3.addItemListener(this);

            c.add(b1);
            c.add(b2);
            c.add(b3);

	}
	
	public void itemStateChanged(ItemEvent e)
	{	
                try
                {
		if(e.getSource()==b1)
		UIManager.setLookAndFeel(
                      "javax.swing.plaf.metal.MetalLookAndFeel");
                else if(e.getSource() == b2)
                    UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                else if(e.getSource() == b3)
                    UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                }
                catch(Exception o)
                {}
	   SwingUtilities.updateComponentTreeUI(c);           
}
}
