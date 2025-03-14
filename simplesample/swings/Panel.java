import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class Panel extends JFrame
{
public Panel()
{
setTitle("Box 1");
JPanel c=(JPanel)getContentPane();
c.setLayout(new GridLayout());
JButton ok=new JButton("ok");
c.add(ok);
JButton cancel=new JButton("cancel");
c.add(cancel);
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
Panel b=new Panel();
b.setSize(400,400);
b.setVisible(true);
}
}
