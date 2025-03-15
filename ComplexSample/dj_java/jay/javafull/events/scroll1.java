import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="scroll1.class" width=250 height=150>
</applet>*/
public class scroll1 extends Applet implements AdjustmentListener
{
        Scrollbar r,g,b;
        int red,green,blue;
        Color c;
        public void init()
        {
                r=new Scrollbar(Scrollbar.VERTICAL,1,10,1,255);
                g=new Scrollbar(Scrollbar.VERTICAL,1,10,1,255);
                b=new Scrollbar(Scrollbar.VERTICAL,1,10,1,255);
                add(r);
                add(g);
                add(b);
                r.addAdjustmentListener(this);
                g.addAdjustmentListener(this);
                b.addAdjustmentListener(this);
        }
        public void adjustmentValueChanged(AdjustmentEvent e)
        {
                
                red=r.getValue();
                green=g.getValue();
                blue=b.getValue();
                repaint();
        }
        public void paint(Graphics g)
        {
                
                c=new Color(red,green,blue);
                setBackground(c);
        }
}



