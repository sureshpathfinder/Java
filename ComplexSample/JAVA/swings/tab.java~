import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Tab extends JFrame
{
JTabbedPane fpane=new JTabbedPane();
JPanel First=new JPanel();
JPanel Second=new JPanel();
JPanel Third=new JPanel();
public Tab()
{
getContentPane().setLayout(new BorderLayout());
fpane.addTab("First",First);
First.setVisible(true);
fpane.addTab("Second",Second);
Second.setVisible(true);
fpane.addTab("Third",Third);
Third.setVisible(true);
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
Tab newtab=new Tab();
newtab.setVisible(true);
newtab.setSize(400,400);
}
}
