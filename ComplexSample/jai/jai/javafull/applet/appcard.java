import java.awt.*;
import java.applet.*;
/*<applet code="appcard" width=400 height=400>
</applet>*/
public class appcard extends Applet
{
        Button b1,b2,b3;
        Panel p1;
        CardLayout c;
        public void init()
        {
                b1=new Button("Button1");
                b2=new Button("Button2");
                add(b1);
                add(b2);
                c=new CardLayout();
                p1=new Panel();
                p1.setLayout(c);
                Panel p2=new Panel();
                b3=new Button("Button3");
                p2.add(b3);

        }
}




