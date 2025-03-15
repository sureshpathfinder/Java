import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="appscr1" width=600 height=400>
</applet>*/
public class appscr1 extends Applet implements AdjustmentListener 
{
        Scrollbar r1,g1,b1;
        Color c;
        public void init()
        {
                //scrollbar(style,initialval,thumbsize,min,max);
                r1=new Scrollbar(Scrollbar.VERTICAL,1,100,1,255);
                g1=new Scrollbar(Scrollbar.VERTICAL,1,100,1,255);
                b1=new Scrollbar(Scrollbar.VERTICAL,1,100,1,255);
                r1.addAdjustmentListener(this);
                g1.addAdjustmentListener(this);
                b1.addAdjustmentListener(this);
                add(r1);
                add(g1);
                add(b1);

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


