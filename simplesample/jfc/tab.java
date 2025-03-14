import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class tab extends JFrame
{
JTabbedPane fpane=new JTabbedPane();
JPanel First=new JPanel();
JPanel Second=new JPanel();
JPanel Third=new JPanel();
public tab()
{
getContentPane().setLayout(new BorderLayout());
fpane.addTab("First",First);
fpane.addTab("Second",Second);
fpane.addTab("Third",Third);
fpane.setSelectedIndex(0);
getContentPane().add(fpane,BorderLayout.CENTER);
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
tab b=new tab();
b.setSize(400,400);
b.setVisible(true);
}
}
 