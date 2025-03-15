import java.awt.*;
import java.awt.event.*;
class appfram2 extends Frame
{
     
       appfram2()
        {
        
                addWindowListener(new w());
        }
class w extends WindowAdapter
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
        appfram2 f=new appfram2();
        f.setSize(300,200);
        f.setVisible(true);
        f.setTitle("Stand Alone Application");

}
}

