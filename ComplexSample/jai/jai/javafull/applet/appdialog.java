import java.awt.*;
import java.awt.event.*;
public class appdialog extends Frame 
{
        appdialog()
        {
        addWindowListener(new a());
        }
class a extends WindowAdapter
{
        public void windowClosing(WindowEvent e)
        {
                setVisible(false);
                dispose();
                System.exit(0);
        }
}

        public static void main(String ar[])
        {
                appdialog f=new appdialog();
                f.setSize(300,300);
                f.setVisible(true);
                f.setTitle("File Dialog Demo");
                FileDialog fd=new FileDialog(f,"File Dialog");
                fd.setVisible(true);
        }
}
        
