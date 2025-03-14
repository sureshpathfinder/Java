import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Checkbox extends JFrame implements ItemListener
{
JCheckBox c;
public Checkbox()
{
setTitle("Check box example");
JPanel c1=(JPanel)getContentPane();
c1.setLayout(new GridLayout(2,2));
c=new JCheckBox("Toggle");
c.addItemListener(this);
c1.add(c);
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
public void itemStateChanged(ItemEvent e)
{
if(e.getStateChange()==ItemEvent.SELECTED)
setTitle("checkbox selected");
else
setTitle("checkbox unselected");
}
public static void main(String args[])
{
Checkbox c2=new Checkbox();
c2.setVisible(true);
c2.setSize(250,250);
}
}

  