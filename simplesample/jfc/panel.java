import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class panel extends JFrame
{
public panel()
{
setTitle("Box 1");
JPanel contentpane=(JPanel)getContentPane();
contentpane.setLayout(new GridLayout());
JButton ok=new JButton("ok");
contentpane.add(ok);
JButton cancel=new JButton("cancel");
contentpane.add(cancel);
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
panel b=new panel();
b.setSize(400,400);
b.setVisible(true);
}
}
 
 