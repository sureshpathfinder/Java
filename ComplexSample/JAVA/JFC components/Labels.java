import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Labels extends JFrame
{
JLabel j1,j2;
public Labels()
{
JPanel c=(JPanel)getContentPane();
c.setLayout(new GridLayout(4,1));
setTitle("Label Example");
j1=new JLabel("First label");
j1.setFont(new Font("Arial",Font.PLAIN,14));
c.add(j1);
j2=new JLabel("Just Text");
j2.setFont(new Font("TimesRoman",Font.BOLD,14));
c.add(j2);
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
Labels l1=new Labels();
l1.setSize(250,250);
l1.setVisible(true);
}
}
