import java.awt.*;
import java.applet.*;
/*<applet code="label1.class" width=250 height=150>
</applet>*/
public class label1 extends Applet
{
        Label l1,l2;
        public void init()
        {
                l1=new Label("one",Label.RIGHT);
                l2=new Label("two",Label.LEFT);
	setBackground(Color.blue);
	l1.setBackground(Color.red);
	l1.setForeground(Color.white);        
//adding componenet to applet window
                add(l1);
                add(l2);
        }
}



