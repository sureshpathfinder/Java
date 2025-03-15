import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="appbut1" width=600 height=400>
</applet>*/
public class appbut1 extends Applet implements ActionListener
{
        Button b1,b2;
        String s="";
        public void init()
        {
                b1=new Button("Karthik");
                b2=new Button("Gayathri");
                b1.addActionListener(this);
                b2.addActionListener(this);
                add(b1);
                add(b2);
        }
        public void actionPerformed(ActionEvent e)
        {
                s=e.getActionCommand();
                if(s.equals("Karthik"))
                {
                       showStatus("Label for the button1 is: "+b1.getLabel());
                }
                else
                        showStatus("Label for the button2 is: "+b2.getLabel());
                
              repaint();
        }
        public void paint(Graphics g)
        {
                g.drawString("Label for Button 1 is: "+b1.getLabel(),100,100);
                g.drawString("Label for Button 2 is: "+b2.getLabel(),100,120);
                g.drawString("Param String for Buttons:"+paramString(),20,140);
                
        }
}


