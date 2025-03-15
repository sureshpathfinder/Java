import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="apptex2" width=600 height=400>
</applet>*/
public class apptex2 extends Applet
{
        TextArea ta;
        public void init()
        {
                ta=new TextArea("Karthik",10,10,1);
               add(ta);
        }
}
