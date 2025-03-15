import java.awt.*;
import java.applet.*;
/*<applet code="button1.class" width=250 height=150>
</applet>*/
public class button1 extends Applet
{
        Button b1,b2;
        public void init()
        {
                b1=new Button();
                b2=new Button("One");
        //adding componenet to applet window
                add(b1);
                add(b2);
        }
}



