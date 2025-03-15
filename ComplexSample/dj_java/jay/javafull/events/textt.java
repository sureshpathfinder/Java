import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="textt" width=200 height=200>
</applet>*/
public class textt extends Applet implements TextListener
{
        TextField t1,t2;
        public void init()
        {
                t1=new TextField(10);
                t2=new TextField(10);
                add(t1);
                add(t2);
                t1.addTextListener(this);
        }
        public void textValueChanged(TextEvent e)
        {
                String s;
                s=t1.getText();
                t2.setText(s);
                repaint();
        }
}



