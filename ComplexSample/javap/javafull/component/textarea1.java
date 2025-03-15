import java.awt.*;
import java.applet.*;
/*<applet code="textarea1.class" width=250 height=150>
</applet>*/
public class textarea1 extends Applet
{
        TextArea t1;
        public void init()
        {
                t1=new TextArea("Karthik",5,15,0);
//0.vertical and horizontal
//1. vertical scroll bar only
//2. horizontal only
//3. No Scroll bars
                add(t1);
        }       
}

