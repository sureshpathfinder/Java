import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class Box0 extends JFrame
{
public Box0()
{
setTitle("Box 1");
JPanel c=(JPanel)getContentPane();
c.setLayout(new BorderLayout());
Box m=new Box(BoxLayout.X_AXIS);
JButton ok=new JButton("ok");
c.add("East",ok);
JButton cancel=new JButton("cancel");
c.add("West",cancel);
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
b.setSize(200,200);
b.setVisible(true);
}
}
 