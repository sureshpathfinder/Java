import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="appgrid" width=600 height=400>
</applet>*/
public class appgrid extends Applet 
{
        int i;
        Button b;
        public void init()
        {
                setLayout(new GridLayout(3,6,50,30));
              for(i=1;i<=16;i++)
              {
                b=new Button(""+i);
                add(b);
               }

        }
}


