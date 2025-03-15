import java.awt.*;
import java.applet.*;
/*<applet code="appflow1" width=600 height=400>
</applet>*/
public class appflow1 extends Applet
{
        Checkbox c1,c2,c3;
               public void init()
        {
       setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
             
                c1=new Checkbox("Karthik",true);
                c2=new Checkbox("Agathiyar");
                c3=new Checkbox("Suguna");
                add(c1);
                add(c2);
                add(c3);
        }
}


