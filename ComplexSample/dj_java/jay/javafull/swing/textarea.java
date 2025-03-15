import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=textarea width=150 height=150>
</applet>*/
public class textarea extends JApplet
{
        JTextArea jt;
        public void init()
        {
                Container cp=getContentPane();
                cp.setLayout(new FlowLayout());
                jt=new JTextArea("Karthik has been"+
                                "\nworking has a faculty");
                jt.setFont(new Font("Arial",Font.ITALIC,15));
                cp.add("Center",jt);
        }
}


