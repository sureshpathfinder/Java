import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="appscr1" width=600 height=400>
</applet>*/
public class appscr1 extends JApplet implements AdjustmentListener 
{
        JScrollBar r1,g1,b1;
        Color c;
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());
                //scrollbar(style,initialval,thumbsize,min,max);
                r1=new JScrollBar(Scrollbar.VERTICAL,1,100,1,255);
                g1=new JScrollBar(Scrollbar.VERTICAL,1,100,1,255);
                b1=new JScrollBar(Scrollbar.VERTICAL,1,100,1,255);
                r1.addAdjustmentListener(this);
                g1.addAdjustmentListener(this);
                b1.addAdjustmentListener(this);
                cp.add(r1);
                cp.add(g1);
                cp.add(b1);

        }
        public void adjustmentValueChanged(AdjustmentEvent e)
        {
                repaint();
        }
        public void paint(Graphics g)
        {
                c=new Color(r1.getValue(),g1.getValue(),b1.getValue());
                setBackground(c);
        }
}


