import java.awt.*;
import java.applet.*;
/*<applet code="check1.class" width=250 height=150>
</applet>*/
public class check1 extends Applet
{
        Checkbox c1,c2;
        public void init()
        {
                c1=new Checkbox("one",true);
                c2=new Checkbox("two");
        //adding componenet to applet window
                add(c1);
                add(c2);
        }
}



