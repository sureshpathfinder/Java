import java.awt.*;
import java.applet.*;
/*<applet code="text1.class" width=250 height=150>
</applet>*/
public class text1 extends Applet
{
        TextField t1,t2,t3;
        public void init()
        {
               t1=new TextField();
               t2=new TextField("Karthik");
               t3=new TextField(10);
               t3.setEchoChar('?');
               add(t1);
               add(t2);
               add(t3);
        }      

}



