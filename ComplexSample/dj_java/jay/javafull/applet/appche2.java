import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="appche2" width=600 height=400>
</applet>*/
public class appche2 extends Applet implements ItemListener
{
        CheckboxGroup c;
        Checkbox c1,c2,c3;
        String s1,s2,s3;
        public void init()
        {
                c=new CheckboxGroup();
                c1=new Checkbox("Karthik",c,true);
                c2=new Checkbox("Agathiyar",c,false);
                c3=new Checkbox("Suguna",c,false);
                c1.addItemListener(this);
                c2.addItemListener(this);
                c3.addItemListener(this);
                add(c1);
                add(c2);
                add(c3);
        }
        public void itemStateChanged(ItemEvent e)
        {
                repaint();
        }
        public void paint(Graphics g)
        {
                g.drawString("Label for C3 Checkbox: "+c3.getLabel(),100,100);
                g.drawString("State for C3 Checkbox: "+c3.getState(),100,120);
                g.drawString("Current selection: "+c.getSelectedCheckbox().getLabel(),100,140);
                               
        }
}


