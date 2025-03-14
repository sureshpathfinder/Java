import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Windows extends JFrame
{
JWindow win1,win2;
public Windows()
{
setTitle("JWindow example");
JPanel contentpane=(JPanel)getContentPane();
contentpane.setLayout(new BorderLayout());
win1=new JWindow(this);
win1.setBounds(25,25,100,100);
JButton btn=new JButton("Hello");
JPanel winpane=(JPanel)win1.getContentPane();
winpane.setBackground(Color.black);
winpane.setLayout(new BorderLayout());
winpane.add("South",btn);
win1.setVisible(true);
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
public static void main(String args[])
{
Windows win=new Windows();
win.setSize(400,400);
win.setVisible(true);
}
}




























