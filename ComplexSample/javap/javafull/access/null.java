import java.awt.*;
import java.applet.*;
/*<applet code="null" width=400 height=300>
</applet>*/
public class null exetnds Applet
{
        Button b1;
        TextField t1;
        public void init()
        {
                setLayout(null);
                b1=new Button("Karthik");
                b1.setBounds(40,40,100,40);

                t1=new TextField("40,70,100,40");
                t1.setBounds(40,70,100,40);
                add(b1);
                add(t1);
        }
}

