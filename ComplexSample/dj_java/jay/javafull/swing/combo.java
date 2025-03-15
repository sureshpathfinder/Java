import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=combo width=300 height=100>
</applet>*/
public class combo extends JApplet implements ItemListener
{
        JLabel j1;
        ImageIcon ind,pak,sri;
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());

/*              ImageIcon ind=new ImageIcon("india.gif");
                ImageIcon pak=new ImageIcon("pakistan.gif");
                ImageIcon sri=new ImageIcon("srilanka.gif");*/

                JComboBox jc=new JComboBox();
                jc.addItem("India");
                jc.addItem("Pakistan");
                jc.addItem("SriLanka");
                jc.addItemListener(this);
                cp.add(jc);

                j1=new JLabel(new ImageIcon("india.gif"));
                cp.add(j1);

        }
        public void itemStateChanged(ItemEvent e)
        {
                String a=(String)e.getItem();
                //j1.setIcon(new ImageIcon(s+".gif"));
	if(a.equals("Pakistan"))
	{                
	j1.setIcon(new ImageIcon("pakistan.gif"));
	}      
	 else if(a.equals("SriLanka"))
	{
	j1.setIcon(new ImageIcon("srilanka.gif"));
	 }
	else
	{
	j1.setIcon(new ImageIcon("india.gif"));
	}	
         }
}