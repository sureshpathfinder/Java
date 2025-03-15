import javax.swing.*;
import java.awt.event.*;
public class file extends JFrame
{
        JFileChooser jfc;
        
        public file()
        {
                setTitle("ssi FileChooser");
                JPanel cp=(JPanel)getContentPane();
                jfc=new JFileChooser();
                cp.add(jfc,"Center");
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
                file f=new file();
                f.setVisible(true);
                f.pack();
        }
}
