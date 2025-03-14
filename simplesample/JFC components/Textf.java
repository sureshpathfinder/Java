import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
public class Textf extends JFrame
{
JTextField la;
public Textf()
{
setTitle("Text Field Instance");
JPanel c=(JPanel)getContentPane();
c.setLayout(new FlowLayout());
la=new JTextField(25);
la.setFont(new Font("Arial",Font.PLAIN,14));
c.add(la);
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
Textf tt=new Textf();
tt.setSize(250,250);
tt.setVisible(true);
}
}
