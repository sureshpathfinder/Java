import java.awt.*;
import java.applet.*;
/*<applet code="null1" width=400 height=300>
</applet>*/
public class null1 extends Applet
{
        Button b1;
        TextField t1;
        public void init()
        {
                setLayout(null);
                b1=new Button("Karthik");
                b1.setBounds(40,40,100,40);
                //start x,start y,width,height
                t1=new TextField("40,90,100,40");
                t1.setBounds(40,90,100,20);
                add(b1);
                add(t1);
        }
}

