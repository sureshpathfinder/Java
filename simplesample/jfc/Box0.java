import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class Box0 extends JFrame
{
public Box0()
{
setTitle("Box 1");
JPanel contentpane=(JPanel)getContentPane();
contentpane.setLayout(new BorderLayout());
JButton ok=new JButton("ok");
contentpane.add("North",ok);
JButton cancel=new JButton("cancel");
contentpane.add("South",cancel);
myadapter myapp=new myadapter();
addWindowListener(myapp);
}
private class myadapter extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
public static void main(String args[])
{
Box0 b=new Box0();
b.setSize(400,400);
b.setVisible(true);
}
}
 