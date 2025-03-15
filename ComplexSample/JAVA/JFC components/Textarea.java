import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
public class Textarea extends JFrame
{
JTextArea jt;
public Textarea()
{
JPanel c=(JPanel)getContentPane();
c.setLayout(new BorderLayout());
setTitle("Text area example");
jt=new JTextArea();
jt.setFont(new Font("Arial",Font.PLAIN,14));
c.add("Center",jt);
myadapter myapp=new myadapter();
addWindowListener(myapp);
}
class myadapter extends WindowAdapter
{
public void WindowClosing(WindowEvent e)
{
System.exit(0);
}
}
public static void main(String args[])
{
Textarea tx=new Textarea();
tx.setSize(150,150);
tx.setVisible(true);
}
}
