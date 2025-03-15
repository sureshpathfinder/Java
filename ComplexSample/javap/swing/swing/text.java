import java.awt.*;
import javax.swing.*;
/*<applet code=text width=250 height=150>
</applet>*/
public class text extends JApplet
{
        JTextField t1;
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());
                t1=new JTextField(15);
                cp.add(t1);
        }
}


