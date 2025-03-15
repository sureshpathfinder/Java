import java.awt.*;
import javax.swing.*;
/*<applet code=label width=250 height=150>
</applet>*/
public class label extends JApplet
{
        JLabel l1,l2;
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());
                ImageIcon ind=new ImageIcon("worldcup.gif");
                l1=new JLabel(ind);
                cp.add(l1);
          }
}


