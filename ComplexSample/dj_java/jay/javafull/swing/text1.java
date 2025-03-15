import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=text width=250 height=150>
</applet>*/
public class text1 extends JFrame
{
        JTextField t1;
        public text1()
        {
                setTitle("TextField Example");
                JPanel cp=(JPanel)getContentPane();
                cp.setLayout(new FlowLayout());
                t1=new JTextField(15);
                cp.add(t1);
                myadapter myapp=new myadapter();
                addWindowListener(myapp);
        }
        class myadapter extends WindowAdapter
        {
                public void windowClosing(WindowEvent e)
                {
                        System.exit(0);
                }
        }
        public static void main(String ar[])
        {
                text1 t=new text1();
                t.setVisible(true);
                t.setSize(250,150);
        }
}


