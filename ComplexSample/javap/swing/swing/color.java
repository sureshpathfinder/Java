import javax.swing.*;
import java.awt.event.*;
public class color extends JFrame
{
        JColorChooser jc;
        
        public color()
        {
                setTitle("Karthik's ColorChooser");
                JPanel cp=(JPanel)getContentPane();
                jc=new JColorChooser();
                cp.add(jc,"Center");
                myadapter myapp=new myadapter();
                addWindowListener(myapp);
        }
        class myadapter extends WindowAdapter
        {
                public void windowclosing(WindowEvent e)
                {
                        System.exit(0);
                }
        }

        public static void main(String ar[])
        {
             //   JFrame jf=new JFrame("Karthik's ColorChooser");
                color c=new color();
                c.setVisible(true);
               c.pack();
        }
}
